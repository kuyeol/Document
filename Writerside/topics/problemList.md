# Algorithm List

# 코딩 테스트 추천 문제 (LeetCode 기준)

 > 아래 문제는 구글 면접에서 자주 출제되는 유형과 핵심 알고리즘 및 자료구조를 활용하는 문제들을 중심으로 선정했습니다.
 > - 문제 해결 능력과 코드 구현 능력을 동시에 평가할 수 있으며, 초급부터 고급까지 다양한 난이도의 문제를 포함하고 있습니다.



# 배열 (Array)

<procedure title="배열 (Array)">

<procedure title="Two Sum (Easy)">
<note>

> [!note]
> 
> 설명: 가장 기본적인 배열 문제 중 하나입니다. 해시 테이블을 활용하여 효율적으로 문제를 해결하는 방법을 연습할 수 있습니다.

</note>

```kotlin

fun solutionCode() {
//TODO:...
}

```

  [Link](https://leetcode.com/problems/two-sum/)
</procedure>

<procedure title="Best Time to Buy and Sell Stock (Easy)">
  <note>
    설명: 배열을 순회하며 최댓값과 최솟값을 찾는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
</procedure>

<procedure title="Contains Duplicate (Easy)">
  <note>
    설명: 배열에 중복된 원소가 있는지 확인하는 문제입니다. 해시 테이블이나 정렬을 활용할 수 있습니다.
  </note>

  [Link](https://leetcode.com/problems/contains-duplicate/)
</procedure>

<procedure title="Product of Array Except Self (Medium)">
  <note>
    설명: 자기 자신을 제외한 모든 원소의 곱을 구하는 문제입니다. 효율적인 알고리즘을 고민해 볼 필요가 있습니다.
  </note>

  [Link](https://leetcode.com/problems/product-of-array-except-self/)
</procedure>

<procedure title="Maximum Subarray (Medium)">
  <note>
    설명: 연속된 부분 배열의 합 중 최댓값을 찾는 문제입니다. 동적 계획법을 활용할 수 있습니다.
  </note>

  [Link](https://leetcode.com/problems/maximum-subarray/)
</procedure>
</procedure>

# 연결 리스트 (Linked List)
<procedure title="연결 리스트 (Linked List)">
<procedure title="Reverse Linked List (Easy)">
  <note>
    설명: 연결 리스트를 뒤집는 문제입니다. 포인터를 조작하는 연습을 할 수 있습니다.
  </note>

  [Link](https://leetcode.com/problems/reverse-linked-list/)
</procedure>

<procedure title="Merge Two Sorted Lists (Easy)">
  <note>
    설명: 두 개의 정렬된 연결 리스트를 병합하는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/merge-two-sorted-lists/)
</procedure>

<procedure title="Linked List Cycle (Easy)">
  <note>
    설명: 연결 리스트에 사이클이 있는지 확인하는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/linked-list-cycle/)
</procedure>

<procedure title="Remove Nth Node From End of List (Medium)">
  <note>
    설명: 연결 리스트의 끝에서 N번째 노드를 제거하는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
</procedure>
</procedure>

# 문자열 (String)
<procedure title="문자열 (String)">
<procedure title="Valid Palindrome (Easy)">
  <note>
    설명: 주어진 문자열이 회문인지 확인하는 문제입니다. 문자열 처리 연습을 할 수 있습니다.
  </note>

  [Link](https://leetcode.com/problems/valid-palindrome/)
</procedure>

<procedure title="Longest Substring Without Repeating Characters (Medium)">
  <note>
    설명: 반복되지 않는 문자로 이루어진 가장 긴 부분 문자열의 길이를 찾는 문제입니다. 슬라이딩 윈도우를 활용할 수 있습니다.
  </note>

  [Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
</procedure>

<procedure title="Valid Anagram (Easy)">
  <note>
    설명: 두 문자열이 Anagram 관계인지 확인하는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/valid-anagram/)
</procedure>

<procedure title="Group Anagrams (Medium)">
  <note>
    설명: 문자열 배열에서 Anagram 관계인 문자열들을 그룹화 하는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/group-anagrams/)
</procedure>
</procedure>

# 트리 (Tree)
<procedure title="트리 (Tree)">
<procedure title="Binary Tree Inorder Traversal (Easy)">
  <note>
    설명: 이진 트리의 중위 순회를 구현하는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/binary-tree-inorder-traversal/)
</procedure>

<procedure title="Maximum Depth of Binary Tree (Easy)">
  <note>
    설명: 이진 트리의 최대 깊이를 찾는 문제입니다. 재귀를 활용할 수 있습니다.
  </note>

  [Link](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
</procedure>

<procedure title="Validate Binary Search Tree (Medium)">
  <note>
    설명: 주어진 이진 트리가 이진 탐색 트리인지 확인하는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/validate-binary-search-tree/)
</procedure>

<procedure title="Same Tree (Easy)">
  <note>
   설명: 두개의 트리가 동일한지 확인하는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/same-tree/)
</procedure>
</procedure>

# 그래프 (Graph)
<procedure title="그래프 (Graph)">
<procedure title="Number of Islands (Medium)">
  <note>
    설명: 2D 그리드에서 연결된 섬의 개수를 세는 문제입니다. DFS나 BFS를 활용할 수 있습니다.
  </note>

  [Link](https://leetcode.com/problems/number-of-islands/)
</procedure>

<procedure title="Clone Graph (Medium)">
  <note>
    설명: 그래프를 복제하는 문제입니다. DFS나 BFS를 활용할 수 있습니다.
  </note>

  [Link](https://leetcode.com/problems/clone-graph/)
</procedure>

<procedure title="Course Schedule (Medium)">
 <note>
  설명: 그래프를 사용해서 코스를 수강할 수 있는지 확인하는 문제입니다.
 </note>

 [Link](https://leetcode.com/problems/course-schedule/)
</procedure>
</procedure>

# 동적 계획법 (Dynamic Programming)
<procedure title="동적 계획법 (Dynamic Programming)">
<procedure title="Climbing Stairs (Easy)">
  <note>
    설명: 계단을 오르는 경우의 수를 찾는 문제입니다. 동적 계획법의 기초를 다질 수 있습니다.
  </note>

  [Link](https://leetcode.com/problems/climbing-stairs/)
</procedure>

<procedure title="Coin Change (Medium)">
  <note>
    설명: 주어진 동전으로 특정 금액을 만들 수 있는 최소 동전 개수를 찾는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/coin-change/)
</procedure>

<procedure title="Longest Common Subsequence (Medium)">
  <note>
   설명: 두 문자열에서 가장 긴 공통된 부분 문자열을 찾는 문제입니다.
  </note>

  [Link](https://leetcode.com/problems/longest-common-subsequence/)
</procedure>
</procedure>

# 정렬 및 검색 (Sorting and Searching)
<procedure title="Binary Search (Easy)">
 <note>
  설명: 정렬된 배열에서 특정 원소를 찾는 이진 탐색을 구현하는 문제입니다.
 </note>

 [Link](https://leetcode.com/problems/binary-search/)
</procedure>