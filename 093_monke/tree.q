Ruawatrain :: Benjamin Belotser, David Deng, Josiah Moltz
APCS pd6
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05
time spent: 1 hrs


DISCO
------------------------------------------------
* Pre-order and In-order can construct a tree!! (This is sick)
================================================


QCC
------------------------------------------------
* What on earth is the point of a balanced or complete tree... those were weird.
* What exactly is left-justified?
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
Towards the light!! (downwards)

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
A cycle free graph
A graph where every path between two vertices is unique (this and the cycle definition are very linked)
Open-tours are only possible every node has at most one child (it essentially looks like a line)
Closed-tours are always impossible

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
Differ by 1 allows us to distinguish between balanced and complete trees (otherwise they would have the same definition)

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
The lengths of the longest paths you can take from the right and left subtrees differ by 1.
Ignoring the last two levels, a balanced tree is perfect (but not every tree satisfying this is balanced)

Is a perfect tree complete?
Yes

Is a complete tree balanced?
Yes

Is the Man Who Is Tall Happy?
None of us have seen this

What must be true of perfect trees but not others?
Every level has twice the vertices above it
Every node except for those at the maximum depth have two children
================================================


C'EST POSSIBLE?
------------------------------------------------
Can we reconstruct a tree given that its Pre-Order traversal path is EGDKINLOW and In-Order traversal path is EKDNIOLWG.
        E
         \
          G
         /
        D
       / \
      K   I
         / \
        N   L
           / \
          O   W
In general we should be able to construct a tree given Pre-Order and In-Order traversal path.
The reason is as follows:
  Pre-Order will tell us the ROOT of the tree.
  In-Order will then tell us whether the next node is in the LEFT or RIGHT sub-trees.
  Thus, given the Pre-Order traversal <root>STUFF and the In-Order traversal STUFF1<root>STUFF2
  We know that STUFF1 is the Left sub-tree + <root> and STUFF2 is the Right sub-tree from <root>
  We also can then split STUFF into two parts containing the re-ordered STUFF1 and STUFF2 since both traversals process left-subtree before right-subtree
  Finally we recursively continue this process until the root is the only thing left, at which point we know it is a leaf.
================================================
