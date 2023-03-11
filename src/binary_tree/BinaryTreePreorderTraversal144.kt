package binary_tree

fun main() {
    val node = TreeNode(5).also {
        it.left = TreeNode(4)
        it.right = TreeNode(3)
    }

    val result = BinaryTreePreorderTraversal144().preorderTraversal(node)
    println(result)
}

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class BinaryTreePreorderTraversal144 {
    fun preorderTraversal(root: TreeNode?): List<Int> {

        return if (root != null) {
            listOf(root.`val`) + preorderTraversal(root.left) + preorderTraversal(root.right)
        } else {
            emptyList()
        }
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}