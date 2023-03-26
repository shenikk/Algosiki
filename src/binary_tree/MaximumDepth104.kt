package binary_tree

import kotlin.math.max

fun main() {
    val node = TreeNode(1).also {
        it.left = null
        it.right = TreeNode(2).also { node ->
            node.left = TreeNode(3)
        }
    }

    val result = MaximumDepth104().maxDepth(node)
    println(result)
}

class MaximumDepth104 {
    private var answer = 1
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        topDownApproach(root, 1)
        return answer
    }

    private fun topDownApproach(root: TreeNode?, depth: Int) {
        if (root == null) return

        if (root.left == null && root.right == null) {
            answer = max(answer, depth)
        }

        topDownApproach(root.left, depth + 1)
        topDownApproach(root.right, depth + 1)
    }

    private fun botttomUpApproach(root: TreeNode?, depth: Int): Int {
        if (root == null) return 0

        val left = botttomUpApproach(root.left, depth + 1)
        val right = botttomUpApproach(root.right, depth + 1)

        return max(left, right) + 1
    }
}