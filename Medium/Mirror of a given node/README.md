<h2><a href="https://practice.geeksforgeeks.org/problems/mirror-of-a-given-node/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab">Mirror of a given node</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a Binary tree, the problem is to find mirror of a given node. The mirror of a node is a node which exist at the mirror position of node in opposite subtree at the root.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
          1        
&nbsp;       /   \       
&nbsp;      2     3     
&nbsp;     / \   / \    
&nbsp;    4   5 6   7   
and target = 4
<strong>Output: </strong>7
<strong>Explanation: </strong>You can see below that the mirror 
node of 4 is 7.</span>
<span style="font-size:18px">          1       |       1
        /   \     |     /   \
       2     3    |    3     2
      / \   / \   |   / \   / \
     4   5 6   7  |  7   6 5   4</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
&nbsp;       1
&nbsp;     /   \
&nbsp;    2     3
&nbsp;   / \
&nbsp;  4   5
and target = 4</span>
<span style="font-size:18px"><strong>Output: </strong>-1</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>findMirror()&nbsp;</strong>which takes root node of the tree and a integer <strong>target </strong>as input parameter and returns the value of the mirror node of the given target node. If the mirror node does not exists&nbsp;return -1.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=n&lt;=10<sup>4</sup><br>
1&lt;=data of node&lt;=10<sup>4</sup><br>
1&lt;=target&lt;=10<sup>4</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;