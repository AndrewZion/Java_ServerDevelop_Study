# Java中HashMap与ArrayList常用语法

## HashMap

### entrySet()

Map中存放的元素均为键值对，Map中采用**Entry内部类**来表示一个映射项，映射项包含Key和Value。Map.Entry里面包含getKey()和getValue()方法

遍历Map代码如下：

```java
	Map<String, String> map = new HashMap<String, String>();
	map.put("1", "value1");
	map.put("2", "value2");
	map.put("3", "value3");
	System.out.println("通过Map.entrySet遍历key和value");
	for (Map.Entry<String, String> entry : map.entrySet()) {
        System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	}
```

### stream()

Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。

Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。

这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如**筛选， 排序，聚合**等。

*示例代码：*

```java
List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
```

### sorted()

sorted排序用法

*示例代码：*

```java
 List<User> sortedUsers = users.stream().sorted(Comparator.comparing(e -> e.getAge())).collect(Collectors.toList());
//等效写法如下
List<User> sortedUsers = users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
```

#### 降序的几种方式：

1. 使用reversed：

   ```java
   //年龄降序
   List<User> collect = users.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());
   ```

   

2. 使用Comparator.reverseOrder：

   ```java
   //年龄降序
   List<User> collect = users.stream().sorted(Comparator.comparing(User::getAge, Comparator.reverseOrder())).collect(Collectors.toList());
   ```

   

3. 在sorted中使用compareTo

   ```java
   //年龄降序
   List<User> collect = users.stream().sorted((x, y) -> y.getAge().compareTo(x.getAge())).collect(Collectors.toList());
   ```

   

4. 在sorted自定义规则

   ```java
   //年龄降序
   List<User> collect = users.stream().sorted((x, y) -> y.getAge() - x.getAge()).collect(Collectors.toList());
   ```

   

5. 多级排序

   ```java
   //先按照年龄降序，年龄相同的按照身高降序
   List<User> collect = users.stream().sorted(Comparator.comparing(User::getAge, Comparator.reverseOrder()).thenComparing(User::getHeight, Comparator.reverseOrdetr)).collect(Collectors.toList());
   ```

   

### collect()

**collect(Collectors.toList())**用法参考上述代码

## ArrayList

### ArrayList转换为数组

#### String数组：

```java
List<String> list = new ArrayList<>();
list.add("a");
list.add("b");
list.add("c");
String[] arr = (String[])list.toArray(new String[list.size()]);
```

#### 其他类型，如int数组：

**方式一：循环遍历赋值**

```java
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
int[] arr = new int[list.size()];
for (int i = 0; i < list.size(); i++) {
    arr[i] = list.get(i);
}
```

**方式二：流处理**

```java
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
```

*但是流处理方式，效率并不高。*

