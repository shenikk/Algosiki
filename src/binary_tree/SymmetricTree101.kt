package binary_tree

fun main() {
    val node = TreeNode(1).also {
        it.left = TreeNode(2).also { node ->
            node.right = TreeNode(3)
        }
        it.right = TreeNode(2).also { node ->
            node.right = TreeNode(3)
        }
    }

    val result = SymmetricTree101().isSymmetric(node)
    println(result)
}
class SymmetricTree101 {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return false

        return leftValues(root.left) == rightValues(root.right)
    }

    private fun leftValues(root: TreeNode?): List<Int> {
        return if (root != null) {
            listOf(root.`val`) + leftValues(root.left) + leftValues(root.right)
        } else {
            listOf(-1)
        }
    }

    private fun rightValues(root: TreeNode?): List<Int> {
        return if (root != null) {
            listOf(root.`val`) + rightValues(root.right) + rightValues(root.left)
        } else {
            listOf(-1)
        }
    }
}