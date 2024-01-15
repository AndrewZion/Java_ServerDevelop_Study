# Java中栈、队列以及双端队列的常见操作

## 栈

```java
//创建栈
Stack<Integer> stack = new Stack<>();
//peek()：查看栈顶部的对象，而不从栈中删除它
int num1 = stack.peek();
//pop()：删除此栈顶部的对象，并返回值
int num1 = stack.pop();
//push()：入栈
int num1 = ...;
stack.push(num1);
//empty()：测试栈是否为空，空为true，反之为false
boolean b = stack.empty();
//size()：返回栈的元素个数
int stackSize = stack.size();
```

## 队列

```java
//创建队列
Queue<Integer> queue = new LinkedList<>();
//peek()：返回队列头部的元素，而不从队列删除它
int num1 = queue.peek();
//poll()：删除队列头部的元素，并返回值
int num1 = queue.poll();
//offer()：添加元素到队列尾部
int num1 = ...;
queue.offer(num1);
//isEmpty()：测试队列是否为空，空为true，反之为false
boolean b = queue.isEmpty();
//size()：返回队列的元素数
int queueSize = queue.size();
```

## 双端队列

```java
//创建双端队列
Deque<Integer> deque = new LinkedList<>();
//peek()、peekFirst()：返回队列头部的元素，而不从队列删除它
int num1 = deque.peek();
int num1 = deque.peekFirst();
//peekLast()：返回队列尾部的元素，而不从队列删除它
int num1 = deque.peekLast();
//poll()、pollFirst()：删除队列头部的元素，并返回它
int num1 = deque.poll();
int num1 = deque.pollFirst();
//offer()、offerLast()：在队列的尾部插入元素
int num1 = ...;
deque.offer(num1);
deque.offerLast(num1);
//offerFirst()：在队列的头部插入元素
int num1 = ...;
deque.offerFirst(num1);
//isEmpty()：测试队列是否为空，空为true，反之为false
boolean b = deque.isEmpty();
//size()：返回队列的元素数
int dequeSize = deque.size();
```

