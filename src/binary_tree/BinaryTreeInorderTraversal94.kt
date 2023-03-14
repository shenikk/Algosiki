package binary_tree

fun main() {
    val node = TreeNode(1).also {
        it.left = null
        it.right = TreeNode(2).also { node ->
            node.left = TreeNode(3)
        }
    }
    
    val result = BinaryTreeInorderTraversal94().inorderTraversal(node)
    println(result)
}

/**
 * With regard to time complexity, recursive and iterative methods both will give you O(log n) time complexity
 *
 * Focusing on space complexity, the iterative approach is more efficient
 * since we are allocating a constant amount O(1) of space for the function call
 * and constant space for variable allocations, while the recursive approach takes O(log n) space.
 */
class BinaryTreeInorderTraversal94 {

    /**
     * Recursive approach
     */
    fun inorderTraversal(root: TreeNode?): List<Int> {
        return if (root != null) {
            inorderTraversal(root.left) + listOf(root.`val`) + inorderTraversal(root.right)
        } else {
            emptyList()
        }
    }
}