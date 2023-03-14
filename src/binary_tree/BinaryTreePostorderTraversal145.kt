package binary_tree

fun main() {
    val node = TreeNode(5).also {
        it.left = TreeNode(4)
        it.right = TreeNode(3)
    }

    val result = BinaryTreePostorderTraversal145().postorderTraversal(node)
    println(result)
}

class BinaryTreePostorderTraversal145 {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        return if (root != null) {
            postorderTraversal(root.left) + postorderTraversal(root.right) + listOf(root.`val`)
        } else {
            emptyList()
        }
    }
}