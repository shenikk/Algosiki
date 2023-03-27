package binary_tree

import java.util.*

fun iterativeTraversal(root: TreeNode?): List<Int> {
    val list = mutableListOf<Int>()
    val stack = Stack<TreeNode>()
    if (root == null) return list
    var current = root
    stack.push(root)

    while (stack.size > 0) {
        current = stack.pop()
        list.add(current.`val`)

        if (current.right != null) stack.push(current.right)
        if (current.left != null) stack.push(current.left)
    }
    return list
}