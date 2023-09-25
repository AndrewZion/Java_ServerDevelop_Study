# Java中判断符 == 与equals 相关问题

## == 号判断机制

== 既可以判断基本类型，又可以判断引用类型

- 如果判断基本类型，则判断值是否相等
- 如果判断引用类型，判断的是地址是否相等

## equals 判断机制

equals：是Object类中的方法，只能判断引用类型

- 默认判断的是地址是否相等（Object），子类往往重写该方法，用于判断内容是否相等，比如 Integer，String 子类就重写了 equals 方法

## Integer自动拆装箱

- 自动装箱：就是将基本数据类型自动转换成对应的包装类
- 自动拆箱：就是将包装类自动转换成对应的基本数据类型

```java
public static void main(Stringp[] args) {
    Integer a = 10;	//自动装箱
    int b = a;		//自动拆箱
}
```

对上面的代码进行反编译查看程序具体的运行过程：

对上面代码进行反编译后，得到以下代码

```java
public static void main(String[] args){
    Integer a = Integer.valueOf(10); 
    int b = a.intValue(); 
}
```

int的装配是通过 Integer.valueOf() 方法实现的，而Integer的自动拆箱都是通过 Integer.intValue() 来实现的

首先来看看Integer中对于拆箱的具体源码：

```java
public int intValue() {
    return value;
}
```

拆装的源码很简洁，与我们平时写的get()方法类似，使用名为value的成员变量保存Integer的值，后面通过intValue方法返回一个对应的基础数据类型int

接下来看看装箱的源码：

```java
public static Integer valueOf(int i) {
	if (i >= IntegerCache.low && i <= IntegerCache.high)
		return IntegerCache.cache[i + (-IntegerCache.Low)];
    return new Integer(i);
```

当Java对int类型的基础数据类型进行封装时，会先判断需要封装的值i是否大于IntegerCache.low，并且小于IntegerCache.high（low=-128，high=127）。这其实是Integer的一种缓存机制，Integer内部存在一个名为IntegerCache的静态内部类，针对int类型较多用到的范围-128~127的值进行缓存，Integer在封装这个范围内的值时会直接在缓存中取出对应的Integer对象，当封装超过这个范围的值时才会重新实例化一个Integer对象。

==所以当用 == 判断 Integer 自动装箱类时，value 值会导致返回 boolean 值不同；代码如下：==

````java
	Integer i1 = 10;
	Integer i2 = 10;
	Integer i3 = 128;
	Integer i4 = 128;
	System.out.println(i1 == i2);//true
	System.out.println(i3 == i4);//false
````

- i1 与 i2 是缓存中直接取出的同一个对象，因此地址相同，返回 true
- i3 与 i4 因为值超过范围了，所以是重新实例化的对象，地址不同，返回false

## String判断 ==

```java
        String str1 = "xjtu";
        String str2 = "xjtu";
        System.out.println(str1 == str2);//true
```

String 是引用类型，== 判断的是 str1 与 str2 的地址是否相同，即是否指向同一个对象；因为**Java中字符串的值是不可改变的，相同的字符串在内存中只会存储一份**，所以 str1 与 str2 指向的是同一个对象，返回true