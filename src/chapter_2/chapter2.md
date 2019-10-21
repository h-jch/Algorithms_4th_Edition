# Chapter 2 排序

## ch2_1 初级排序算法

### 2.1.1
- i  min    E A S Y Q U E S T I O N
  0   1     E A S Y Q U E S T I O N
  1   1     A E S Y Q U E S T I O N
  2   6     A E S Y Q U E S T I O N
  3   9     A E E Y Q U S S T I O N
  4  11     A E E I Q U S S T Y O N
  5  10     A E E I N U S S T Y O Q
  6  11     A E E I N O S S T Y U Q
  7   7     A E E I N O Q S T Y U S
  8  11     A E E I N O Q S T Y U S
  9  11     A E E I N O Q S S Y U T
 10  10     A E E I N O Q S S T U Y
 11  11     A E E I N O Q S S T U Y
            A E E I N O Q S S T U Y

### 2.1.2
- 选择排序，一个元素最多可能被交换N次，平均被交换1次

### 2.1.3
- 数组元素从大到小排列

### 2.1.4
- i  j    E A S Y Q U E S T I O N
  1  0    A E S Y Q U E S T I O N
  2  2    A E S Y Q U E S T I O N
  3  3    A E S Y Q U E S T I O N
  4  2    A E Q S Y U E S T I O N
  5  4    A E Q S U Y E S T I O N
  6  2    A E E Q S U Y S T I O N
  7  5    A E E Q S S U Y T I O N
  8  6    A E E Q S S T U Y I O N
  9  3    A E E I Q S S T U Y O N
 10  4    A E E I O Q S S T U Y N
 11  4    A E E I N O Q S S T U Y

### 2.1.5
- 数组元素从小到大排列

### 2.1.6
- 所有的主键都相同，插入排序更快

### 2.1.7
- 逆序数组，选择排序更快

### 2.1.8
- 介于两者之间（不确定）

### 2.1.9
-         E A S Y Q U E S T I O N
  4-sort  E A S Y Q U E S T I O N
          E A S Y Q I E S T U O N
          E A E Y Q I O S T U S N
          E A E N Q I O S T U S Y
  1-sort  A E E N Q I O S T U S Y
          A E E N Q I O S T U S Y
          A E E N Q I O S T U S Y
          A E E N Q I O S T U S Y
          A E E I N Q O S T U S Y
          A E E I N O Q S T U S Y
          A E E I N O Q S T U S Y
          A E E I N O Q S T U S Y
          A E E I N O Q S T U S Y
          A E E I N O Q S S T U Y
          A E E I N O Q S S T U Y

### 2.1.10
- 因为选择排序的运行时间与输入无关，不管对数组中任意间隔的元素进行排序，复杂度都是相同的，而插入排序则不是。对于局部有序的数组，  插入排序运行较快

### 2.1.11
- (Shell.java)

### 2.1.12
- 暂略

### 2.1.13
- 略

### 2.1.14
- 略

### 2.1.15
- 选择排序，交换次数较少

### 2.1.16
- (EX2_2_16.java)

### 2.1.17
- (Insertion.java, Selection.java)

### 2.1.18
- (Insertion.java, Selection.java, EX2_1_18.java)

### 2.1.19
- 略

### 2.1.20
- 略

### 2.1.21
- (Transaction.java)

### 2.1.22
- (SortTransaction.java)

### 2.1.23
- 略

### 2.1.24
- (EX2_1_24.java)

### 2.1.25
- (EX2_1_25.java)

### 2.1.26
- (EX2_1_26.java)

### 2.1.27-2.1.38
- 暂略



## ch2_2 归并排序

### 2.2.1
- k  a[] 0 1 2 3 4 5 6 7 8 9 10 11   i   j   aux[] 0 1 2 3 4 5 6 7 8 9 10 11                       
         A E Q S U Y E I N O  S  T                 A E Q S U Y E I N O  S  T
                                     0   6
  0      A                           1   6           E Q S U Y E I N O  S  T
  1      A E                         2   6             Q S U Y E I N O  S  T
  2      A E E                       2   7             Q S U Y   I N O  S  T
  3      A E E I                     2   8             Q S U Y     N O  S  T
  4      A E E I N                   2   9             Q S U Y       O  S  T
  5      A E E I N O                 2  10             Q S U Y          S  T
  6      A E E I N O Q               3  10               S U Y          S  T
  7      A E E I N O Q S             4  10                 U Y          S  T
  8      A E E I N O Q S S           4  11                 U Y             T
  9      A E E I N O Q S S T         4  12                 U Y               
 10      A E E I N O Q S S T  U      5  12                   Y
 11      A E E I N O Q S S T  U  Y   6  12
         A E E I N O Q S S T  U  Y

### 2.2.2
-                     0 1 2 3 4 5 6 7 8 9 10 11
                      E A S Y Q U E S T I  O  N  
    merge(a,0,0,1)    A E S Y Q U E S T I  O  N
    merge(a,0,1,2)    A E S Y Q U E S T I  O  N
    merge(a,3,3,4)    A E S Q Y U E S T I  O  N
    merge(a,3,4,5)    A E S Q U Y E S T I  O  N
    merge(a,0,2,5)    A E Q S U Y E S T I  O  N
    merge(a,6,6,7)    A E Q S U Y E S T I  O  N
    merge(a,6,7,8)    A E Q S U Y E S T I  O  N
    merge(a,9,9,10)   A E Q S U Y E S T I  O  N
    merge(a,9,10,11)  A E Q S U Y E S T I  N  O
    merge(a,6,8,11)   A E Q S U Y E I N O  S  T
    merge(a,0,5,11)   A E E I N O Q S S T  U  Y

### 2.2.3
-                     0 1 2 3 4 5 6 7 8 9 10 11
    sz=1              E A S Y Q U E S T I  O  N
    merge(a,0,0,1)    A E S Y Q U E S T I  O  N
    merge(a,2,2,3)    A E S Y Q U E S T I  O  N
    merge(a,4,4,5)    A E S Y Q U E S T I  O  N
    merge(a,6,6,7)    A E S Y Q U E S T I  O  N
    merge(a,8,8,9)    A E S Y Q U E S I T  O  N
    merge(a,10,10,11) A E S Y Q U E S I T  N  O
    sz=2
    merge(a,0,1,3)    A E S Y Q U E S I T  N  O
    merge(a,4,5,7)    A E S Y E Q S U I T  N  O
    merge(a,8,9,11)   A E S Y E Q S U I N  O  T
    sz=4
    merge(a,0,3,7)    A E E Q S S U Y I N  O  T
    sz=8
    merge(a,0,7,11)   A E E I N O Q S S T  U  Y

### 2.2.4
- 是的

### 2.2.5
- 自顶向下
    merge(a,0,0,1)->merge(a,0,1,2)->merge(a,3,3,4)->merge(a,0,2,4)      //2->3->5
  ->merge(a,5,5,6)->merge(a,5,6,7)->merge(a,8,8,9)->merge(a,5,7,9)      //2->3->5
  ->merge(a,0,4,9)      //10
  ->merge(a,10,10,11)->merge(a,10,11,12)->merge(a,13,13,14)->merge(a,10,12,14)       //2->3->5
  ->merge(a,15,15,16)->merge(a,15,16,17)->merge(a,18,18,19)->merge(a,15,17,19)       //2->3->5
  ->merge(a,10,14,19)           //10
  ->merge(a,0,9,19)             //20
  ->merge(a,20,20,21)->merge(a,20,21,22)->merge(a,23,23,24)->merge(a,20,22,24)       //2->3->5
  ->merge(a,25,25,26)->merge(a,25,26,27)->merge(a,28,28,29)->merge(a,25,27,29)       //2->3->5
  ->merge(a,20,24,29)           //10
  ->merge(a,30,30,31)->merge(a,30,31,32)->merge(a,33,33,34)->merge(a,30,32,34)       //2->3->5   
  ->merge(a,35,35,36)->merge(a,37,37,38)->merge(a,35,36,38)       //2->4   
  ->merge(a,30,34,38)           //10
  ->merge(a,20,29,38)           //20
  ->merge(a,0,19,38)            //39            
  自底向上
  sz=1:  N=1->N=2    i=38
  sz=2:  N=2->N=4    i=36,37,38
  sz=4:  N=4->N=8    i=32-38
  sz=8:  N=8->N=16   i=32-38
  sz=16: N=16->N=32  i=32-38
  sz=32: N=32->N=39

### 2.2.6
- 暂略

### 2.2.7
- 略

### 2.2.8
- (Merge.java)

### 2.2.9
- (EX2_2_9.java)

### 2.2.10
- (EX2_2_10.java)

### 2.2.11
- (EX2_2_11.java)

### 2.2.12
- 略

### 2.2.13
- 略

### 2.2.14
- (EX2_2_14.java)

### 2.2.15-2.2.29
- 暂略



## ch2_3 快速排序

### 2.3.1
- i  j    0 1 2 3 4 5 6 7 8 9 10 11
  0  12   E A S Y Q U E S T I  O  N
  2  6    E A S Y Q U E S T I  O  N
  2  6    E A E Y Q U S S T I  O  N
  3  2    E A E Y Q U S S T I  O  N
     2    E A E Y Q U S S T I  O  N

### 2.3.2
-  lo  j  hi    0 1 2 3 4 5 6 7 8 9 10 11
                E A S Y Q U E S T I  O  N
    0  2  11    E A E Y Q U S S T I  O  N
    0  1   1    A E E Y Q U S S T I  O  N
    3 11  11    A E E N Q U S S T I  O  Y
    3  3  10    A E E I N U S S T Q  O  Y
    4  4  10    A E E I N U S S T Q  O  Y
    5 10  10    A E E I N O S S T Q  U  Y
    5  5   9    A E E I N O S S T Q  U  Y
    6  7   9    A E E I N O S S T Q  U  Y
    8  9   9    A E E I N O S S Q T  U  Y

### 2.3.3
- N/2 (不确定)

### 2.3.4
- 只要满足数组元素从小到大或者从大到小

### 2.3.5-2.3.31
- 暂略



## ch2_4 优先队列

### 2.4.1
-     P
      P R
      P R I
      P R I O
  R   P I O
      P I O R
  R   P I O
  P   I O
      I O I
  O   I I
      I I T
  T   I I
      I I Y
  Y   I I
  I   I
  I   
      Q
      Q U
      Q U E
  U   Q E
  Q   E
  E   
      U
  U   
      E

### 2.4.2
- 要在常数时间内找到最大元素，则插入元素要线性时间，要在常数时间内插入元素，则找到最大元素要线性时间

### 2.4.3
- (UnorderedArrayMaxPQ.java, OrderedArrayMaxPQ.java, UnorderedLinkedListMaxPQ.java, OrderedLinkedListMaxPQ.java)

### 2.4.4
- 是的，最大堆

### 2.4.5
- 插入    0 1 2 3 4 5 6 7 8 9 10 11 12
   E        E
   A        E A
   S        S A E
   Y        Y S E A
   Q        Y S E A Q
   U        Y S U A Q E
   E        Y S U A Q E E
   S        Y S U S Q E E A
   T        Y T U S Q E E A S 
   I        Y T U S Q E E A S I
   O        Y T U S Q E E A S I  O
   N        Y T U S Q N E A S I  O  E

### 2.4.6
- 插入  删除    0 1 2 3 4 5 6 7 8 9 10
   P             P
   R             R P
   I             R P I
   O             R P I O
         R       P O I
   R             R P I O
         R       P O I
         P       O I
   I             O I I
         O       I I
   T             T I I
         T       I I
   T             T I I
         T       I I
   Y             Y I I
         Y       I I
         I       I
         I       
   Q             Q
   U             U Q
   E             U Q E
         U       Q E
         Q       E
         E      
   U             U
         U
   E             E

### 2.4.7
- 略

### 2.4.8
- 略

### 2.4.9
- 略

### 2.4.10
- 父结点 2k+1     子结点 2k+2

### 2.4.11
- 无序数组

### 2.4.12
- 有序数组

### 2.4.13
- 略

### 2.4.14
- 略

### 2.4.15
- (EX2_4_15.java)

### 2.4.16
- 略

### 2.4.17
- 略

### 2.4.18
- insert(), delMax() 堆不会改变
  insert(), insert(), delMax(), delMax() 堆不会改变

### 2.4.19
- (MaxPQ.java)

### 2.4.20
- 略

### 2.4.21
- 对优先队列的每个元素赋予一个优先值。
  要实现栈，先进栈的元素优先值小，后进栈的元素优先值大，出栈时优先值最大的元素先出栈，则满足栈后进先出的特性。
  要实现队列，先入队的元素优先值大，后入队的元素优先值小，出队时优先值最大的元素先出队，则满足队列先进先出的特性。
  要实现随即队列，入队时随机赋予元素优先值，出队时优先值大的元素先出队。

### 2.4.22
- (MaxPQ.java)

### 2.4.23-2.4.42
- 暂略



## ch2_5 应用

### 2.5.1
- 如果this和that是同一个引用对象，则直接返回0

### 2.5.2
- (EX2_5_2.java)

### 2.5.3
- 略

### 2.5.4
- (EX2_5_4.java)

### 2.5.5
- ex：5 8 5 2 9，第一轮，找到最小元素2和首元素5交换，那么数组中两个5的相对位置发生改变，不稳定

### 2.5.6
- (EX2_5_6.java)

### 2.5.7
- lgN

### 2.5.8
- (Frequency.java, Record.java)

### 2.5.9
- (DJIA.java)

### 2.5.10
- (Version.java)

### 2.5.11
- 略

### 2.5.12
- (Job.java, SPT.java)

### 2.5.13
- (Job.java, Processor.java, LPT.java)

### 2.5.14-2.5.33
- 暂略