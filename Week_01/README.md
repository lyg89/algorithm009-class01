学习笔记

思维导图：https://www.processon.com/view/link/5eca99475653bb6f2a2b9f65

## 复杂度分析
掌握复杂度目标：
1. 要对自己写的程序的时间复杂度、空间复杂度有所了解，写完之后要下意识的分析出时间、空间复杂度；
2. 能够用最简洁的时间、空间复杂度完成这段程序是顶尖职业选手必备的素养。

写程序或在对待面试题时四件套：
1. 确认程序的需求/含义无误；
2. 想出所有可能的解决办法，比较时间、空间复杂度；
3. 找出最优解决方案；
4. 编码与测试。

### 时间复杂度
1. 7种时间复杂度：
O(1)、O(n)、O(log n)、O(n^2)、O(n^3)、O(2^n)、O(n!)

2. 递归情况的时间复杂度分析（示例：斐波那契第n项）：
    - 画出递归（状态）树
    - 总结子节点变化量

    （示例：计算斐波那契第n项时由于有很多重复项的计算，可使用缓存或循环方式实现。）
    
主定理（Master Theorem）--计算分治或递归的时间复杂度

### 空间复杂度
1. 数组长度
2. 递归的深度

### 数组、链表、跳表
#### 基本实现和特性

1. 数组
内存管理器-开辟一段连续的地址空间特性：
① 访问的时间复杂度为O(1)
② 修改的时间复杂度为O(n)
添加元素时进行拷贝操作

2. 链表元素：value、next
特性：
① 修改的效率高，时间复杂度为O(1)
② 访问的效率低，时间复杂度为O(n)

扩展：双向链表prev、循环链表tail的next指向head
Java中源码实现：标准双向链表

LinkedList时间复杂度：![a34e9c4571fdb185159dae505e881c48.png](evernotecid://AFCCEFBA-2B6F-4B5C-A304-D7E3A2EDAF71/appyinxiangcom/11767354/ENResource/p3303)

对应的Array的时间复杂度为：O(n)、O(n)、O(1)、O(n)、O(n)
![b77962c6d722d7edc9e569982dc2f867.png](evernotecid://AFCCEFBA-2B6F-4B5C-A304-D7E3A2EDAF71/appyinxiangcom/11767354/ENResource/p3306)


3. 跳表 SkipList
链表元素有序时如何加速查找呢？
**只能适用于链表里的元素有序的情况下**，所以跳表对标的是平衡树（AVL Tree）和二分查找，是一种插入/删除/搜索都是O(log n)的数据结构。1989年出现。

    最大优势是原理简单、容易实现、方便扩展、效率更高。因此在一些热门的项目里用来替代平衡树，如Redis、LevelDB等。
    
实现：
1. （如何给有序的链表加速？）空间换时间、升维：原始链表的基础上添加多级索引
2. 相较于链表，维护成本高，修改复杂度变为O(log n)
3. 空间复杂度为O(n)

时间复杂度分析：
1. n/2、n/4、n/8、第 k 级索引结点的个数就是 n/(2^k)

2. 假设索引有 h 级，最高级的索引有 2 个结点。n/(2^h) = 2，从而求得 h = log2(n)-1

现实中跳表的形态：索引并不是完全工整的。
![03476f3ef6344574157db772846d5611.png](evernotecid://AFCCEFBA-2B6F-4B5C-A304-D7E3A2EDAF71/appyinxiangcom/11767354/ENResource/p3305)

应用：
LRU缓存使用多链表实现、
Redis - Skip List
