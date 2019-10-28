# Chapter 3 查找

## ch3_1 符号表

### 3.1.1
- (EX3_1_1.java)

### 3.1.2
- (ArrayST.java)

### 3.1.3
- (OrderedSequentialSearchST.java)

### 3.1.4
- (Time.java, Event.java)

### 3.1.5
- (SequentialSearchST.java)

### 3.1.6
- 略

### 3.1.7
- 略

### 3.1.8
- 略

### 3.1.9
- 略

### 3.1.10
- 插入   无序链表
   E       E
   A       A E
   S       S A E
   Y       Y S A E
   Q       Q Y S A E
   U       U Q Y S A E
   E       U Q Y S A E
   S       U Q Y S A E
   T       T U Q Y S A E
   I       I T U Q Y S A E
   O       O I T U Q Y S A E
   N       N O I T U Q Y S A E

### 3.1.11
- 插入   有序数组
   E       E
   A       A E
   S       A E S
   Y       A E S Y
   Q       A E Q S Y
   U       A E Q S U Y
   E       A E Q S U Y
   S       A E Q S U Y
   T       A E Q S T U Y
   I       A E I Q S T U Y
   O       A E I O Q S T U Y
   N       A E I N O Q S T U Y

### 3.1.12
- (BinarySearchST_Item.java)

### 3.1.13
- 基于有序数组实现

### 3.1.14
- 基于无序链表实现

### 3.1.15
- 略

### 3.1.16
- (BinarySearchST.java)

### 3.1.17
- (BinarySearchST.java)

### 3.1.18
- 略

### 3.1.19-3.1.41
- 暂略



## ch3_2 二叉查找树

### 3.2.1
- 略

### 3.2.2
- ACEHRSX   XSRHECA  XASCREH  HRESCXA  HERCSAX

### 3.2.3
- 略

### 3.2.4
- a. 可能   b. 不可能   c. 可能   d. 不可能   e. 可能

### 3.2.5
- 由高到低

### 3.2.6
- (BST.java)

### 3.2.7
- 略

### 3.2.8
- 略

### 3.2.9
- 略

### 3.2.10
- (TestBST.java)

### 3.2.11
- 略

### 3.2.12
- 暂略

### 3.2.13
- (EX3_2_13.java)

### 3.2.14
- (EX3_2_14.java)

### 3.2.15-24
- 略

### 3.2.25-3.2.47
- 暂略



## ch3_3 平衡二叉树

### 3.3.1
- 



## ch3_4 散列表

### 3.4.1
- U E
  T A
  I S
  O Y
  N Q

### 3.4.2
- (SeparateChainingHashST_a.java)

### 3.4.3
- (SeparateChainingHashST_b.java)

### 3.4.4
- 略

### 3.4.5
- 合法，但是会将所有的键映射到同一个地方

### 3.4.6
- 略

### 3.4.7
- 略

### 3.4.8
- 略

### 3.4.9
- (SeparateChainingHashST.java)

### 3.4.10
- M=16      0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
            S Y Q U T I O N                  E  A
  M=10      0 1 2 3 4 5 6 7 8 9
            E A S Y Q U T I O N

### 3.4.11
- 插入   M     0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
   E     4         E
   A     4         E A
   S     8     S   E A
   Y     8     S Y E A
   Q     16    S Y E A Q
   U     16    S Y E A Q U
   T     16    S Y E A Q U T
   I     16    S Y E A Q U T I
   O     32    S Y E A Q U T I                                         O
   N     32    S Y E A Q U T I                                         O  N

### 3.4.12-3.4.18
- 略

### 3.4.19
- (SeparateChainingHashST.java, LinearProbingHashST.java)

### 3.4.20-3.4.43
- 暂略



## ch3_5 应用

### 3.5.1
- (SET.java, HashSET.java)

### 3.5.2
- (SequentialSearchSET.java)

### 3.5.3
- (BinarySearchSET.java)

### 3.5.4
- (HashSTint.java, HashSTdouble.java)

### 3.5.5
- (STint.java, STdouble.java)

### 3.5.6
- (HashSETint.java, HashSETdouble.java)

### 3.5.7
- (SETint.java, SETdouble.java)

### 3.5.8-3.5.35
- 暂略