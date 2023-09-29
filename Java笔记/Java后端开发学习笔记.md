

# Java后端开发学习路线

##  JavaSE

### 第2章 Java概述

#### Java开发注意事项和细节说明

Java应用程序的执行入口是**main()**方法，固定书写格式如下：

```java
public static void main(String[] args) {...}
```

一个源文件最多只能有一个**public类**，其它类的个数不限，**并且编译时会生成与类名称相对应的*class*文件**；

如果源文件包含一个**public类**，则文件名必须按该类名命名，例如下述代码必须命名为**Hello.java**;

```java
public class Hello {
	public static void main(String[] args) {
		System.out.println("谢利博 is studying Java!");
	}
}

class dog {
	public static void main(String[] args) {
		System.out.println("Hello,小狗狗!");
	}
}

class tiger {
	public static void main(String[] args) {
		System.out.println("Hello,小老虎!");
	}
}
```

一个源文件中最多只能有一个**public类**，其它类的个数不限，也可以将**main**方法写在**非prblic类**中，然后指定运行**非public类**，这样入口方法就是**非public的main方法**==如上述代码==。

##### 切忌将专有名词如：boolean，int命名为public class类

#### 转义字符

控制台输出转义字符时，**\n**与**\r**不一样，**\n**是换行，而**\r**则是回车，==回车并不等于换行==，换行很好理解，回车则是光标移动到开头，覆盖掉原有输出字符。代码以及运行输出结果如下

```java
//代码
public class ChangeChar {
	public static void main(String[] args) {
		System.out.println("攸县好地方!\r长沙");
	}
}
//输出结果
D:\code_work\java_work>java ChangeChar
长沙好地方!

```

==长沙并未在第二行输出，而是覆盖了攸县==。

#### 文档注释

文档注释内容可以被**JDK**提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档，一般写在类

***代码格式***

```java
//文档注释

//代码格式

/**
 * @author 谢利博
 * @version 1.0
*/

public class fileComment {
	public static void main(String[] args) {
		System.out.println("I am studying fileComment!");
	}
}
```

cmd命令行生成语法格式：**javadoc -d 文件夹路径 -xx -yy demo.java**

```shell
//示例

D:\code_work\java_work>javadoc -d D:\code_work\java_work\temp -author -version fileComment.java
```

生成的**html**文件中选择***index.html***打开

==其中文档注释，**javadoc标签**==

#### Java代码规范

**1.**类、方法的注释，要以javadoc的方式来写。

**2.**单行、多行注释，是给代码维护者看的，着重告诉读者代码逻辑，如何修改优化，注意什么问题。

**3.**使用**tab**操作，实现缩进，默认整体向右边移动，**shift+tab**整体左移。

**4.**运算符和**=**两边习惯性各加一个空格。如：**2 + 4 * 5 + 345 - 89**

**5.**源文件使用**utf-8**编码

**6.**行宽度不要超过**80字符**

**7.**代码编写采用**次行风格**或**行尾风格（推荐）**

#### DOS命令

**Dos**：*Disk Operating System*磁盘操作系统

常见的**dos命令**

**1.**查看当前目录是有什么内容 **dir**

**dir**查看当前目录，**dir d:\abc2\test200**查看指定目录内容

**2.**切换其他盘 **cd**

切换到d盘，**cd /D d:**，**/D**是为了使命令行维持在当前盘符

**3.**切换到==当前盘==的其他目录下（相对路径或绝对路径）

**cd d:\abc2\test200 cd ..\abc2\test200**

**4.**切换到上一级

**cd ..**

**5.**切换到根目录：**cd \ **

**6.**切换到子目录：**d:\code_work>cd .\java_work\temp**

==了解==

**7.**查看指定目录下的所有子级目录 **tree**

**8.**清屏 **cd**

**9.**退出DOS **exit**

**10.**（**md**创建目录，**rd**删除目录，**copy**拷贝文件，**del**删除文件，**echo**输入内容到文件，**type**查看文件或者创建空文件，**move**移动文件==剪切==）

### 第3章 变量

#### 变量入门

**Java**语法中：字符型变量**char**只能用单引号，字符串型变量**String**只能用双引号

```java
public class var {
	public static void main(String[] args) {
		int age = 30;
		double score = 99.9;
		char gender = '男'; //此处必须用单引号
		String name = "Andrew"; //此处必须用双引号
		System.out.println("人的信息如下："); //此处超过一个字符即字符串用双引号
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		System.out.println(gender);
	}
}
```

#### 输出时 + 号的使用

**1. **当左右两边都是数值型时，做**加法运算**

**2.**当左右两边有一方为字符串，则做**拼接运算**

```java
public class var {
	public static void main(String[] args) {
		System.out.println(100 + 98);
		System.out.println("100" + 98);
		System.out.println(100 + 3 + "Hello");
		System.out.println("Hello" + 100 + 3);
		/*
		运行输出结果
		198
		10098
		103Hello
		Hello1003
		*/
	}
}
```

#### 数据类型

* **Java数据类型**
  * **基本数据类型**
    * 数值型
      * 整数类型
        * byte[1]，占1个字节，大小范围为-128—127
        * short[2]
        * int[4]
        * long[8]
      * 浮点（小数）类型
        * float[4]
        * double[8]
    * 字符型
      * char[2]，存放单个字符
    * 布尔型
      * boolean[1]，存放true，false
  * **引用数据类型**
    * 类（class）
    * 接口（interface）
    * 数组（[ ]）

==字符串属于类==

#### 整型细节

**Java**的整型常量默认为**int**型，声明**long**型常量必须在后面加**‘l'**或**’L‘** ==注意与C/C++区别==

```java
//定义 long 型变量，值的末尾需加 'l' 或 'L'。
//整数类型的数据默认是 int 类型，声明为 long 类型时不添加 'l' 或 'L' 不会报错。
//不加 'L' 默认是 int 型，int 转为 long 是安全的，所以会自动转，能编译通过。
//当变量值超过了 int 的表数范围时，必须添加 'l' 或 'L' ，否则编译不通过，会报错！

public class var {
	public static void main(String[] args) {
		long a = 2147483648L; //末尾的L去掉会报错
		System.out.println(a);
	}
}
```

#### 浮点数细节

**float**4个字节，**double**8个字节

**Java**的浮点型常量默认为**double**型，声明**float**型常量，须加**'f'**或**'F'**

```java
/* 	Java的浮点型常量（具体值）默认为double型，声明
	float型常量，须后加'f'或'F'

	*/
public class varFloat {
	public static void main(String[] args) {
		float num1 = 1.1; //报错 不兼容的类型: 从double转换到float可能会有损失
		float num2 = 1.1f; //对
		double num3 = 1.1; //对
		double num4 = 1.1f; //对
		/*解释：
			末尾加了f，是float型，float型转double型安全，
			类比long a = 100;
			没加l默认int型，int型转long型安全
		*/
		System.out.println(num1);
	}
}
```

浮点数使用陷阱：==2.7和8.1/3比较==

```java
//浮点数小数比较陷阱
public class varFloat {
	public static void main(String[] args) {
		double num1 = 2.7;
		double num2 = 8.1/3;
		System.out.println(num1);
		System.out.println(num2);
		/*
		输出结果：
		2.7
		2.6999999999999997
		所以判断二者数值是否相等，不应该用 ==
		应该按如下方式编写
		*/
		if(Math.abs(num2 - num1) < 0.00001){
			System.out.println("num1与num2相等");
		}
	}
}
```

**Java API文档**网址：*https://www.matools.com* 

#### 字符型细节

```java
//演示char的基本使用
public class varChar {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '韩';
		char c4 = 97;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4); //输出a
	}
}
```

==c4赋值为97，并且c4为字符型变量，因此打印输出时，输出97对应的字符即‘a’==

**切记字符型变量，必须用单引号，双引号为字符串变量**

要使字符型变量输出为对应的整数，可以**(int)字符**

```java
public class varChar {
	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println((int)c1); //输出97
	}
}
```

字符变量可以做运算，例如'a' + 10，输出107

```java
public class varChar {
	public static void main(String[] args) {
		System.out.println('a' + 10); //输出107
	}
}
```

==***Unicode编码兼容ASCII码***==

#### 布尔类型

*与C/C++不同，不可以用0或非0的整数替代false和true*

#### 基本数据类型转换

精度小的类型自动转换为精度大的数据类型——自动类型转换

自动转换规则如下：

**char->int->long->float->double**

**byte->short->int->long->float->double**

*自动类型转换细节*

**1.**有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。

**2.**当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时，就会报错，反之就会进行自动类型转换。

**3.**(**byte**, **short**)和**char**之间不会相互自动转换。

**4.byte**,**short**,**char**他们三者可以计算，在计算时首先转换为**int**类型。

```java
//自动类型转换
public class autoConvert {
	public static void main(String[] args) {
		byte a1 = 10;
		byte a2 = 12;
		byte a3;
		a3 = a1 + a2;//报错：int->byte会有损失
	}
}
```

**5.boolean**不参与转换

**6.**自动提升原则:表达式结果的类型自动提升为操作数中最大的类型

*强制类型转换*

自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符()，但可能造成精度降低或溢出,格外要注意。

```java
//强制类型转换
public class Convert {
	public static void main(String[] args) {
		int i = (int)1.9;
		System.out.println(i);//输出1
		int j = 100;
		byte b1 = (byte)j;
		System.out.println(b1);//输出100
		/*
		注意下面情况会运行错误(输出结果与预期不符)
		*/
		int k = 1000;
		byte b2 = (byte)k;
		System.out.println(b2);
	}
}
```

强转符号只针对最近的操作数有效

```java
public class Convert {
	public static void main(String[] args) {
		//int x = (int)10 * 3.5 + 6 * 1.5;//报错:double->int 损失
		int x = (int)(10 * 3.5 + 6 * 1.5);//输出44
		System.out.println(x);
	}
}
```

#### 基本数据类型和String类型的转换

基本数据类型->**String**类型

*语法：将基本类型+""即可*

```java
public class StringToBasic {
	public static void main(String[] args) {
		int n1 = 100;
		float n2 = 1.1f;
		double n3 = 3.4;
		boolean b1 = true;
		/*在同一行中输出上述变量值
		System.out.println(""+n1+n2+n3+b1);
		*/
		String str1 = n1 + "";
		String str2 = n2 + "";
		String str3 = n3 + "";
		String str4 = b1 + "";
		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);
	}
}
```

**String**类型->基本数据类型

*语法：通过基本类型的包装类调用**parseXX**方法即可*

```java
//String->基本数据类型

public class StringToBasic {
	public static void main(String[] args) {
		String s1 = "123";
		int num1 = Integer.parseInt(s1);
		double num2 = Double.parseDouble(s1);
		float num3 = Float.parseFloat(s1);
		long num4 = Long.parseLong(s1);
		byte num5 = Byte.parseByte(s1);
		short num6 = Short.parseShort(s1);
		boolean b = Boolean.parseBoolean("false");
		System.out.println(num1);//123
		System.out.println(num2);//123.0
		System.out.println(num3);//123.0
		System.out.println(num4);//123
		System.out.println(num5);//123
		System.out.println(num6);//123
		System.out.println(b);//false

		//字符串无法直接转成字符，但是可以获取字符串中的字符
		System.out.println(s1.charAt(1));//'2'
	}
}
```

==注意事项==

在将String类型转成基本数据类型时，要确保String类型能够转成有效的数据，比如我们可以把"123”，转成一个整数，但是不能把"hello”转成一个整数
如果格式不正确，就会抛出异常，程序就会终止。**编译会通过，运行异常**

### 第4章 运算符

#### 算术运算符

分析以下代码运行结果

```java
public class operator {
	public static void main(String[] args) {
		System.out.println(10 / 4);//2
		System.out.println(10.0 / 4);//2.5
		double d = 10 / 4;
		System.out.println(d);//2.0
	}
}
/* 
10 / 4精度为int，所以结果2.5输出2
10.0 / 4精度为double，所以结果2.5输出2.5
10 / 4精度为int，所以结果2.5舍去.5为2，又因为int型转换为double型，所以输出2.0
*/
```

==特别注意最后输出结果：**2.0**不是2.5==

取余/取模运算

本质公式：**a % b = a - a / b * b**如果*a是小数时*，公式变成**a % b = a - (int)a / b * b**

```java
//% 取模，取余
//本质公式：a % b = a - a / b * b;

public class operator {
	public static void main(String[] args) {
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1
        System.out.println(-10.5 % 3);//-1.5
        //-10.5 - (-10) / 3 * 3 = -1.5
	}
}
```

***仔细分析下述2个经典面试题***

```java
//面试题

public class operator {
	public static void main(String[] args) {
		int i1 = 1;
		i1 = i1++;
		System.out.println(i1);//1
		int i2 = 1;
		i2 = ++i2;
		System.out.println(i2);//2
		int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i="+i);//4
        System.out.println("j="+j);//1
        System.out.println("k="+k);//11
	}
}
```

*参照下列图片分析输出结果*

![operator00](.\images\operator00.jpg)

![operator01](.\images\operator01.jpg)

<img src=".\images\operator02.jpg" alt="operator02"  />

*练习题*

定义一个变量保存华氏温度,华氏温度转换摄氏温度的公式为:5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。[234.5]

```java
public class operator {
	public static void main(String[] args) {
		double huaShi = 234.5;
		// double sheShi = 5 / 9 * (huaShi - 100);//有Bug
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("华氏度：" + huaShi + "对应摄氏度：" + sheShi);
	}
}
//总是输出0.0，因为5 / 9 = 0，0 * 任何数都是0，所以修改5->5.0
```

#### 逻辑运算符

**逻辑与&和短路与&&**：二者规则一致，都是全为*true*，结果才为*true*

**1.&&**短路与:如果第一个条件为*false*，则第二个条件不会判断，最终结果为*false*,效率

**2.&**逻辑与:不管第一个条件是否为*false*，第二个条件都要判断，效率低

开发中，使用的基本是短路与**&&**，效率高

```java
public class operator {
	public static void main(String[] args) {
		int a = 4;
		int b = 9;
		if(a < 1 & ++b < 50) {
			System.out.println("条件符合");
		}
		System.out.println("b=" + b);//b=10
	}
}
```

==++b < 50条件也判断了==

**逻辑或|和短路或||**：二者规则一致，都是有一个为*true*，结果即为*true*

区别和**与**运算符类似：逻辑或**|**不管第一个条件是否为*true*，第二个条件都要判断。

**异或^**

a ^ b：逻辑异或，a和b一真一假时为*true*，否则为*false*

逻辑运算符练习题

```java
//练习题
public class operator {
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		if(x++ == 6 & ++y == 6) {
            //x++ == 6:因为是后++，所以先判断x == 6，再自增
			//++x == 6:则是先自增，再判断x == 6
            x = 11;
		}
		System.out.println("x=" + x + ",y=" + y);//x=6,y=6
	}
}
```

```java
public class operator {
	public static void main(String[] args) {
		boolean b1 = false;
		boolean b2 = true;
		if(b1 = true) {
			System.out.println("真");
		}
		if(b2 = false) {
			System.out.println("真");
		} else {
			System.out.println("假");
		}
		//输出
		/*
		真
		假
		*/
	}
}
```

*boolean*类型赋值语句，b1 = true，所以判断为*true*，b2 = false，所以判断为*false*

#### 赋值运算符

复合赋值运算符会进行强制类型转换

```java
public class operator {
	public static void main(String[] args) {
		byte b = 3;
		//b = b + 2;//报错 int->byte有损失
		b += 2;//等价于 b = (byte)(b + 2) 编译可以通过
		System.out.println("通过无错误");
	}
}
```

#### 运算符优先级

只有**单目运算符、赋值运算符**是从右向左运算的

运算优先级：

1) ()，{}等
2) 单目运算 ++ --
3) 算术运算符
4) 位移运算符
5) 比较运算符
6) 逻辑运算符
7) 三元运算符
8) 赋值运算符

#### 标识符命名规则与规范

注意标识符命名规则：

==**由26个英文字母大小写，0-9，或$组成**==

int h-s = ... 报错

int goto = ...报错：*goto是保留字*

**保留字：**现有Java版本尚未使用，但以后版本可能会作为关键字使用。自己命名标识符时要避免使用这些保留字

命名规范：

1. **包名:**多单词组成时所有字母都小写: aaa.bbb.ccc//比如com.hsp.crm
2. **类名、接口名:**多单词组成时，所有单词的首字母大写: XxxYyyZzz***[大驼峰]***比如:TankShotGame
3. **变量名、方法名:**多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写:xoxxYyyZnz***[小驼峰，简称驼峰法]***比如:tankShotGame
4. **常量名:**所有字母都大写。多单词时每个单词用下划线连接: XXX_YYY_ZZZ比如:定义一个所得税率 TAX_RATE

#### 键盘输入语句

在编程中，需要接收用户输入的数据，就可以使用键盘输入语句来获取。需要一个扫描器(对象)，就是**Scanner**

步骤：

1) 导入该类的所在包，**java.util.***
2) 创建该类对象（声明变量）
3) 调用里面的功能

示例代码如下：

```java
//键盘输入语句
import java.util.*;
//import java.util.Scanner;
public class input {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b, c;
		a = myScanner.nextInt();//输入int型
		b = myScanner.nextInt();
		c = a + b;
		System.out.println(c);
		String str1;
		//str1 = myScanner.next();//遇到空格停止
		str1 = myScanner.nextLine();//整行字符串输入包括空格
		System.out.println("==================");
		System.out.println(str1);
	}
}
```

#### 进制

对于整数，有四种进制表示方式：

1. 二进制:0,1，满2进1，以*0b或0B*开头。
2. 十进制:0-9，满10进1。
3. 八进制:0-7，满8进1，以数字*0*开头表示。
4. 十六进制:0-9及A(10)-F(15)，满16进1，以*0x或0X*开头表示。此处的A-F不区分大小写。

进制转换：

*常规：*

1. 2、8、16进制转换为10进制：每一位乘以对应的次方最后相加
2. 10进制转换为2、8、16进制：用短除法，一直除直到商为0，余数的*逆序列*即为对应结果

*特殊：*

1. 2进制转换为8进制：从低位开始，将2进制数每三位一组，转成对应的8进制数，最后组合起来即为转换结果
2. 2进制转换为16进制：类似的，从低位开始，将2进制数每四位一组，转成对应的16进制数
3. 8进制转换为2进制：将8进制每1位，转换成**一个3位的2进制数**即可
4. 16进制转换为2进制：将16进制每一位，转换成**4位的一个2进制数**即可

#### 位运算

##### **原码、反码、补码**(==*重难点*==)

以下内容背诵：

1. 二进制的最高位是符号位：0表示正数，1表示负数
2. 正数的原码，反码，补码都一样(三码合一)
3. 负数的反码 = 它的原码符号位不变，其他位取反(0->1,1->0)
4. 负数的补码 = 它的反码 + 1，负数的反码 = 负数的补码 - 1
5. 0的反码，补码都是0
6. java没有无符号数，换言之，java中的数都是有符号的
7. *在计算机运算的时候，都是以**补码**的方式来运算的*
8. 返回运算结果时，要看他的原码

==**注意**==：*负数的补码的补码是原码*，**所以已知负数的补码求原码，只需继续求其补码得到的即为原码（取反后+1）**

**位运算符：**

java中有7个位运算(&、|、^、~、>>、<<、>>>)

按位与**&**：两位全为1，结果为1，否则为0

按位或**|**：两位只要有一个为1，结果为1，否则为0

按位异或**^**：两位一个为0，一个为1，结果为1，否则为0

按位取反**~**：0->1，1->0

具体示例代码如下：

```java
public class BitOperator {
	public static void main(String[] args) {
		/*
		分析：
		2 & 3
		2的原码：	00000000 00000000 00000000 00000010
		2的补码：	00000000 00000000 00000000 00000010(运算)
		3的原码：	00000000 00000000 00000000 00000011
		3的补码：	00000000 00000000 00000000 00000011(运算)
		2 & 3的补码:00000000 00000000 00000000 00000010(这是运行结果的补码)
		2 & 3 = 2

		~ -2
		-2的原码： 	10000000 00000000 00000000 00000010
		-2的反码：	11111111 11111111 11111111 11111101
		-2的补码：	11111111 11111111 11111111 11111110
		~ -2的补码：00000000 00000000 00000000 00000001
		~ -2 = 1

		2 | 3
		2的原码：	00000000 00000000 00000000 00000010
		2的补码：	00000000 00000000 00000000 00000010(运算)
		3的原码：	00000000 00000000 00000000 00000011
		3的补码：	00000000 00000000 00000000 00000011(运算)
		2 | 3的补码:00000000 00000000 00000000 00000011
		2 | 3 = 3

		2 ^ 3
		2的原码：	00000000 00000000 00000000 00000010
		2的补码：	00000000 00000000 00000000 00000010(运算)
		3的原码：	00000000 00000000 00000000 00000011
		3的补码：	00000000 00000000 00000000 00000011(运算)
		2 ^ 3的补码:00000000 00000000 00000000 00000001
		2 ^ 3 = 1
		*/
		System.out.println(2 & 3);//2
		System.out.println(~ -2);//1
		System.out.println(2 | 3);//3
		System.out.println(2 ^ 3);//1

	}
}

```

**位运算符：>>、<<和>>>**

1. 算术右移>>：低位溢出，符号位不变，并用符号位补溢出的高位(**正数补0，负数补1**)==正数相当于/ 2==
2. 算术左移<<：符号位不变，低位补0==正数相当于* 2==
3. 逻辑右移(无符号右移)>>>：低位溢出，忽略符号位，高位补0**(忽略符号位的意思是，符号位也跟着右移)**

==**注意**==：*上述位移运算也是用**补码**进行运算*

示例代码如下：

```java
public class BitOperator {
	public static void main(String[] args) {
		System.out.println(1 >> 2);//0
		System.out.println(-1 >> 2);//-1
		System.out.println(1 << 2);//4
		System.out.println(-1 << 2);//-4
		System.out.println(3 >>> 2);//0
		System.out.println(-3 >>> 2);//1073741823
		/*
		分析：
		1 >> 2
		1的补码：		00000000 00000000 00000000 00000001
		1 >> 2的补码：	00000000 00000000 00000000 00000000
		1 >> 2 = 0

		-1 >> 2
		-1的原码：		10000000 00000000 00000000 00000001
		-1的补码：		11111111 11111111 11111111 11111111
		-1 >> 2的补码：	11111111 11111111 11111111 11111111
		-1 >> 2的原码：	10000000 00000000 00000000 00000001
		-1 >> 2 = -1

		1 << 2
		1的补码：		00000000 00000000 00000000 00000001
		1 << 2的补码：	00000000 00000000 00000000 00000100
		1 << 2 = 4

		-1 << 2
		-1的原码：		10000000 00000000 00000000 00000001
		-1的补码：		11111111 11111111 11111111 11111111
		-1 << 2的补码：	11111111 11111111 11111111 11111100
		-1 << 2的原码：	10000000 00000000 00000000 00000100
		-1 << 2 = -4

		3 >>> 2
		3的原码：		00000000 00000000 00000000 00000011
		3的补码：		00000000 00000000 00000000 00000011
		3 >>> 2的补码：	00000000 00000000 00000000 00000000
		3 >>> 2 = 0

		-3 >>> 2
		-3的原码：		10000000 00000000 00000000 00000011
		-3的补码：		11111111 11111111 11111111 11111101
		-3 >>> 2的补码：00111111 11111111 11111111 11111111
		-3 >>> 2的原码：00111111 11111111 11111111 11111111
		-3 >>> 2 = 1073741823
		*/
	}
}
```

记住一点：***位运算永远是用==补码==进行运算的***

#### 本章作业

取余/取模运算

本质公式：**a % b = a - a / b * b**如果*a是小数时*，公式变成**a % b = a - (int)a / b * b**

```java
public class HomeWork {
	public static void main(String[] args) {
		System.out.println(-10.5 % 3);//-1.5
	}
}
```

注意：有小数运算时，得到的结果为近似值

```java
public class HomeWork {
	public static void main(String[] args) {
		int i = 66;
		System.out.println(++i + i);//134
		System.out.println(i);//67
	}
}
```

判断下列赋值语句是否正确

```java
double num3 = 3d;//√ 末尾加d或D表示double型
int i = 48; char ch = i + 1;//× int->char错误，但是char ch = 49√
```

### 第5章 控制结构

顺序控制

单分支结构

双分支结构

#### 多分支结构

多分支结构可以没有**else**

#### switch分支

**具体实现代码**

```c++
switch(expression){
	case constant-expression:
		statement(s);
		break;//可选
	case constant-expression:
		statement(s);
		break;//可选
		...
	default://可选
		statement(s);
}
```

***switch语句遵循规则***

==switch语句必须遵循以下规则：==

+ **switch**语句中的**expression**是一个常量表达式，必须是一个**整型**或**枚举类型**(*一个变量有几种可能的取值时，可以将它定义为枚举类型*)。
+ **case**的**constant-expression**必须与**switch**中的变量具有相同的数据类型，且必须是一个常量或字面量。
+ 当遇到**break**语句时，**switch**终止，控制流将跳转到**switch**语句后的下一行。
+ 不是每一个**case**都需要包含**break**。如果**case**语句不包含**break**，控制流将会*继续*后续的 **case**，直到遇到**break**为止。==**(意思是，如果某个case匹配成功并且没有break，就会穿透执行接下来的语句块*即上述代码中的statement(s)部分*不会判断是否匹配，甚至default都会执行，直到出现break跳出分支)**==
+ 一个**switch**语句可以有一个可选的**default case**，出现在**switch**的结尾。**default case**可用于在上面所有**case**都不为真时执行一个任务。**default case**中的**break**语句不是必需的。

#### switch分支结构细节

1. 表达式数据类型，应和case后的常量**类型一致**，或者是可以**自动转成可以相互比较的类型**，例如输入的是字符，而常量是*int*

==例如下述代码可以编译运行==

```java
public class Switch01 {
	public static void main(String[] args) {
		int ch = 99;
		switch(ch) {
			case 'a':
				System.out.println("ok1");
				System.out.println("ok2");
				break;
			case 'c':
				System.out.println("ok3");
				System.out.println("ok4");
		}
	}
}
```



1. *switch(表达式)*中表达式的返回值必须是：(byte,short,int,char,enum[枚举],String)
2. *case*子句中的值必须是常量**(或者是常量表达式，如：'b' + 1)**，而不能是变量
3. *default*子句是可选的，可以没有
4. *break*语句用来在执行完一个*case*分支后使程序跳出*switch*语句块；如果没有写*break*，程序会顺序执行到*switch*结尾，除非遇到*break*

**switch课堂练习，分数及格问题**

示例代码如下：

```java
/*
	题目：
	对学生成绩大于60分的,输出"合格"。低于60分的，输出"不合格"。
	(注︰输入的成绩不能大于100，须用到switch分支)

	思路分析：
	switch分支判断匹配的是常量，不是范围，所以可以用到(数值/60)，
	并且强制转换成(int)，结果为0，不合格，结果为1，合格
*/

public class Switch01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double d;
		int i;
		d = cin.nextDouble();
		if (d >= 0 && d <= 100) {
			i = (int)(d / 60);
			switch (i) {
				case 0:
					System.out.println("成绩不合格，需要继续加油哦");
					break;
				case 1:
					System.out.println("成绩合格，太棒了");
					break;
			}
		} else 
			System.out.println("成绩输入有误");
	}
}
```

**季节所属问题：**

```java
/*
	打印该月份所属的季节(利用穿透)
	3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12,1,2 冬季
*/

public class Switch01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i;
		i = cin.nextInt();
		switch (i) {
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("输入月份有误");
		}
	}
}
```

#### for循环控制

*for*有四要素：循环变量初始化，循环条件，循环操作，循环变量迭代

*循环条件*是返回布尔值的表达式

无限循环写法如下：

```java
//无限循环，死循环
for(;;){
	...
}
```

**dos cmd窗口运行程序时，快捷键Ctrl + c停止退出**

#### while循环控制

*while*循环也有四要素

#### do while循环控制

**循环语句至少执行一次**

课堂练习

```java
/*
	统计1--200之间能被5整除不能被3整除的个数
*/

public class For {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int low, high, i, count;
		low = cin.nextInt();
		high =cin.nextInt();
		i = low;
		count = 0;
		do {
			if (i % 5 == 0 && i % 3 != 0) {
				++count;
			}
			++i;
		} while (i <= high);
		System.out.println(count);
		
	}
}
```

#### 多重循环控制

1. 将一个循环放在另一个循不体内，就形成了嵌套循环。其中,**for ,while ,do...while**均可以作为外层循环和内层循环。*（建议一般使用两层，最多不要超过3层，否则，代码的可读性很差）*
2. 实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为**false**时，才会完全跳出内层循环,才可结束外层的当次循环，开始下一次的循环。

课堂练习：

```java
import java.util.Scanner;
/*
	课堂练习
	需求：
		编写一个main方法
		统计3个班成绩情况，每个班有5名同学，
		求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]
		统计三个班及格人数，每个班有5名同学
*/

public class MulForExercise {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i, j, count;
		double sum_1, sum_2, sum_3, sum;
		double[][] score = new double[3][5];
		count = 0;
		sum_1 = sum_2 = sum_3 = sum = 0;
		System.out.println("请依此输入3个班同学的成绩：");
		for(i = 0; i < 3; i++){
			for(j = 0; j < 5; j++) {
				score[i][j] = cin.nextDouble();
				switch(i) {
					case 0:
						sum_1 += score[i][j];
						break;
					case 1:
						sum_2 += score[i][j];
						break;
					case 2:
						sum_3 += score[i][j];
				}
				sum += score[i][j];
				if(score[i][j] >= 60)
					count++;
			}
		}
		System.out.println("各班平均分如下：");
		System.out.println("" + (sum_1 / 5) + " " + (sum_2 / 5) + " " + (sum_3 / 5));
		System.out.println("总平均分为：" + sum / 15);
		System.out.println("及格人数为：" + count);
	}
}
```

*先死后活*：

可以用**classNum和stuNum**代替3和5；

*编程思想：**化繁为简，先死后活***

==打印空心金字塔：==

```java
/*
	课堂练习
	需求：
		在控制台打印输出空心金字塔
*/
import java.util.Scanner;
/*
	分析思路：
	先打印斜三角形
	*				1个*
	**				2个*
	***				3个*
	****			4个*
	*****			5个*

	再打印实心金字塔
		*				1个* 2 x 层数 - 1 	4个空格
	   ***				3个*					3个空格
	  *****				5个*					2个空格
	 *******			7个*					1个空格
	*********			9个*					0个空格

	最后打印空心金字塔
		*				1个*	 第一个位置和最后一个位置	4个空格
	   * *				2个*							3个空格
	  *   *				2个*							2个空格
	 *     *			2个*							1个空格
	*********			9个* 最后一行全有				0个空格

	先死后活：将层数5赋值为变量(键盘输入)
*/
public class Stars {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i, j, k, layer;
		layer = cin.nextInt();
		for(i = 1; i <= layer; i++) {
			for(k = 1; k <= layer - i; k++)
				System.out.print(" ");
			for(j = 1; j <= 2 * i - 1; j++) {
				if(j == 1 || j == 2 * i - 1 || i == layer)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
```

***练习：打印空心菱形***

```java
//举一反三：打印空心菱形
/*
	打印实心菱形
		*				1个* 2 x 层数 - 1 	4个空格
	   ***				3个*					3个空格
	  *****				5个*					2个空格
	 *******			7个*					1个空格
	*********			9个*					0个空格
	 *******			7个*					1个空格
	  *****				5个*					2个空格
	   ***				3个*					3个空格
	    *				1个*					4个空格
*/

public class Stars {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i, j, k, layer, i_1;
		System.out.println("请输入奇数层数:");
		layer = cin.nextInt();
		for(i = 1; i <= layer; i++) {
			//空心菱形的关键在于它是对称结构
			//所以下半部分执行过程与上半部分一致
			if(i > layer / 2 + 1)
				i_1 = layer - i + 1;
			else
				i_1 = i;
			for(k = 1; k <= layer - i_1; k++)
				System.out.print(" ");
			for(j = 1; j <= 2 * i_1 - 1; j++) {
				if(j == 1 || j == 2 * i_1 - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
```

#### break语句

**返回随机数：**

*Math.random()*：**返回带正号的double值，该值大于等于0.0且小于1.0**

```java
public class Break {
	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i) {
			//大于等于1，小于等于100的随机数
			System.out.println((int)(Math.random() * 100) + 1);
		}
	}
}
```

*break语句用于跳出语句块，使用在**switch、for、while或者do while语句中**。*

*break细节：*

- **break**语句出现在多层嵌套的语句块中时，可以通过标签指明要终止的是哪一层语句块
- 标签名称可以由程序员指定
- *实际开发中尽量不要使用终止指定标签（可读性差）*
- 没有指定终止标签，默认退出最近循环体

```java
public class Break {
	public static void main(String[] args) {
		abc1:
		for(int i = 0; i < 4; i++) {
			abc2:
			for(int j = 0; j < 10; j++) {
				if(j == 2) {
					//比较下述两种写法的输出
					//break abc2;// 等价break abc2
					break abc1;
				}
				System.out.println("j = " + j);
			}
		}
	}
}
```

*字符串比较：**equals()***

```java
public class Break {
	public static void main(String[] args) {
		String name = "林黛玉";
		//两种写法：推荐第二种（避免空指针[待阐述]）
		// System.out.println(name.equals("贾宝玉"));
		System.out.println("贾宝玉".equals(name));
	}
}
```

#### continue语句

*与**break**类似，**continue**也可以指定开始于下一次特定循环*

```java
// 示例代码

public class Continue {
	public static void main(String[] args) {
		lable1:
		for(int j = 0; j < 2; j++) {
			lable2:
			for(int i = 0; i < 10; i++) {
				if(i == 2) {
					// continue;//等价continue lable2
					// continue lable2;
					continue lable1;
				}
				System.out.println("i = " + i);
			}
		}
	}
}
```

#### return语句

*当**return**用在方法时，表示跳出方法，如果用在主方法，则跳出程序*

**Math.pow(a, b)**，返回a的b次幂的值

```java
char c1 = 'a';
System.out.println(++c1);//++c1和c1++输出b，并非b对应的整型ASCII码
System.out.println(c1 + 1);//输出整数
```

### 第6章 数组、排序和查找

**数组**可以存放多个同一类型的数据。**数组**也是一种数据类型，是*引用类型*。

***数组名.length***求数组长度

```java
// int a[]与int[] a等价
//推荐int[] a
```

**动态初始化**

**静态初始化**

*数组创建后，如果没有赋值，有默认值，**int 0，short 0，byte 0，long 0，float 0.0，double 0.0，char \u0000，boolean false，String null***

*\u0000*代表空格

#### 数组赋值机制

*基本数据类型赋值，这个值就是具体的数据（值拷贝），而且相互不影响。数组在默认情况下是引用传递，赋的值是地址（地址拷贝），改变值会有影响。*

==分析下列代码==

```java
public class Array {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = n1;
		n2 = 20;
		System.out.println(n1 + " " + n2);//输出：10 20
		System.out.println("========");
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
         //不论改arr1或者arr2，两者都会变化
		// arr2[0] = 10;
		arr1[1] = 10;
		for(int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();
		for(int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
	}
}
```

参考下列示意图，*基本数据类型值保存在栈，引用数据类型值地址保存在栈，真正值保存在地址指向的堆，例如：改变其中一个arr1或arr2的值，两者都会变化。*

![数组赋值机制](.\images\数组赋值机制.png)

**练习：**数组反转

```java
public class Array {
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 66};
		//方法一：找规律反转
		/*for(int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
		//方法二：逆序赋值
		int len = arr.length, i;
		int[] arr1 = new int[len];
		for(i = 0; i < len; i++) {
			arr1[i] = arr[len - i - 1];
		}
		//让arr指向arr1数据空间，
		//此时arr原来的数据空间就没有变量引用会被当做垃圾,销毁
		arr = arr1;
		for(i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
```

*数据空间没有变量引用，当做垃圾销毁*

```java
/*
	需求：根据用户输入y/n来决定是否继续数组扩容
*/
public class Array {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] arr = {1, 2, 3};
		do {
			System.out.println("请输入数组添加的值：");
			int addNum = cin.nextInt();
			int[] arrNew = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++)
				arrNew[i] = arr[i];
			arrNew[arrNew.length - 1] = addNum;
			System.out.println("扩容后的数组元素如下：");
			for(int i = 0; i < arrNew.length; i++)
				System.out.print(arrNew[i] + " ");
			System.out.println();
			arr = arrNew;
			System.out.println("是否继续：y/n");
			char c = cin.next().charAt(0);
			if(c == 'n')
				break;
		} while(true);
	}
}
```

*注意：上述代码中，do-while循环中可以重复声明同一个名称的变量（addNum，arrNew），是因为该变量的生命周期就是一次循环，之后被内存回收。*

#### 冒泡排序

```java
// 需求：冒泡排序
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("请输入待排序数组大小：");
		int n, i, j;
		n = cin.nextInt();
		int[] arr = new int[n];
		System.out.println("请依次输入数组的值：");
		for(i = 0; i < n; i++)
			arr[i] = cin.nextInt();
		for(i = 0; i < n - 1; i++)
			for(j = n - 1; j > i; j--) {
				if(arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		System.out.println("升序后的数组如下：");
		for(i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
```

*二维数组在内存中的存储*

![image-20230804205951433](.\images\二维数组.png)

**二维数组可以是变长度数组**

```java
// 变长度二维数组arr

/*
arr[0]:	1
arr[1]:	2 	3
arr[2]:	4 	5 	6
arr[4]:	7	8	9	10
*/

public class Array {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("请输入二维数组大小：");
		int n, i, j, k;
		n = cin.nextInt();
		int[][] arr = new int[n][];
		k = 1;
		for(i = 0; i < n; i++) {
			arr[i] = new int[i + 1];
			for(j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
```

其中**arr[i]**在**new**开辟空间之前，**arr[i]**为**null**。

```java
int[] arr = {};
// arr为空数组，arr.length = 0
```

二维数组的声明方式有：

```java
int[][] y;
int[] y[];
int y[][]
```

特别注意第二种声明方式

#### 查找

*顺序查找和二分查找*

#### 本章作业细节

```java
// 下面数组定义正确的有
		String strs[] = {'a', 'b', 'c'}; //char -> String错误
		String[] strs = {"a", "b", "c"}; //正确
		String[] strs = new String{"a", "b", "c"}; //错误
		String strs[] = new String[] {"a", "b", "c"}; //正确
		String[] strs = new String[3]{"a", "b", "c"}; //错误
```

*特别注意上述第四种写法，也是能通过编译*

```java
// 有个升序的数组，要求插入一个元素，该数组顺序依然是升序
public class Array {
	public static int findIndex(int[] arr, int target) {
		int low, high;
		for(low = 0, high = arr.length - 1; low <= high;) {
			int mid = (low + high) / 2;
			if(arr[mid] == target) {
				return mid;
			} else if(arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
	public static int[] insert(int[] arr, int index, int target) {
		int[] arrNew = new int[arr.length + 1];
		int i, j;
		for(i = 0, j = 0; i < arrNew.length; i++) {
			if(i == index) {
				arrNew[i] = target;
				continue;
			}
			arrNew[i] = arr[j++];
		}
		return arrNew;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] arr;
		int n, i, insertNum, index;
		System.out.println("请输入原数组大小：");
		n = cin.nextInt();
		arr = new int[n];
		System.out.println("依次输入数组元素：");
		for(i = 0; i < n; i++)
			arr[i] = cin.nextInt();
		System.out.println("请输入插入元素：");
		insertNum = cin.nextInt();
		index = findIndex(arr, insertNum);
		arr = insert(arr, index, insertNum);
		for(i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
	}
}
```

**注意细节：**

- *静态方法*中不能直接调用*非静态方法*。因为*非静态方法*不是独立存在的，它是依附于对象存在——即只有申明了对象，才能通过对象调用。而*静态方法*则可以直接通过类名调用，而不需要申明对象。因此直接引用*非静态方法*就会出错。==所以insert与findIndex函数必须加static==
- 数组参数传递机制是==地址传递==，子函数调用数组改变其值的话，主函数的值也会改变（==详细见第7章面向对象编程==），但是这题的初始构思程序代码却不属于上述情况，代码如下。

```java
public class Array {
	public static int findIndex(int[] arr, int target) {
		int low, high;
		for(low = 0, high = arr.length - 1; low <= high;) {
			int mid = (low + high) / 2;
			if(arr[mid] == target) {
				return mid;
			} else if(arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
	public static void insert(int[] arr, int index, int target) {
		int[] arrNew = new int[arr.length + 1];
		int i, j;
		for(i = 0, j = 0; i < arrNew.length; i++) {
			if(i == index) {
				arrNew[i] = target;
				continue;
			}
			arrNew[i] = arr[j++];
		}
		System.out.println("a");
		arr = arrNew;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] arr;
		int n, i, insertNum, index;
		System.out.println("请输入原数组大小：");
		n = cin.nextInt();
		arr = new int[n];
		System.out.println("依次输入数组元素：");
		for(i = 0; i < n; i++)
			arr[i] = cin.nextInt();
		System.out.println("请输入插入元素：");
		insertNum = cin.nextInt();
		index = findIndex(arr, insertNum);
		insert(arr, index, insertNum);
		for(i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
	}
}
```

代码分析：

在*insert*函数中，传入的*arr*虽然是地址传递，但是在*insert*函数中并未出现修改数组值的代码（*如：==arr[i] = 10==*）,而且最后让子函数中的*arr*指向新创建的*arrNew*，自然主函数中的*arr*保持不变。

### 第7章 面向对象编程（基础部分）

#### 类与对象

*对象[属性, 行为]*

**注意:从类到对象，目前有几种说法:1.创建一个对象 2.实例化一个对象 3.把类实例化...**

```java
public class Object {
    public static void main(String[] args) {
        Cat cat01 = new Cat();
        // cat01 就是Cat的一个实例化对象
        cat01.name = "小白";
        cat01.age = 3;
        cat01.color = "白色";
        Cat cat02 = new Cat();
        // cat01 就是Cat的一个实例化对象
        cat02.name = "小花";
        cat02.age = 8;
        cat02.color = "花色";
        System.out.println("第一只猫：名字 = " + cat01.name + " 年龄 = " 
        + cat01.age + " 颜色 = " + cat01.color);
        System.out.println("第二只猫：名字 = " + cat02.name + " 年龄 = " 
        + cat02.age + " 颜色 = " + cat02.color);
    }
}

class Cat {
    String name;
    int age;
    String color;
}
```

*通过**类与对象**有利于数据的管理，效率较高*

*对象在内存中的存在形式，如下图所示*

![Alt](.\images\对象内存存在机制.png)

*字符串存储于方法区的常量池中，栈中存储的是对象地址，对象空间实际存放于堆中。使用new关键字创建对象空间时，会加载类信息（==注意同一个类加载一次，下一个new Cat不会重复加载Cat类==）*

对象具有*属性（成员变量）以及成员方法*，*成员变量可以是基本数据类型，也可以是引用类型（对象，数组）。*

==属性的定义语法：访问修饰符 属性类型 属性名==

**访问修饰符**：*控制属性的访问范围*，四种访问修饰符：public，proctected，默认，private

**创建一个对象之后，如果属性不赋值，那么属性有默认值，规则和数组一致：** *int 0，short 0，byte 0，long 0，float 0.0，double 0.0，char \u0000，boolean false，String null*

```java
//示例代码
public class Object {
    public static void main(String[] args) {
        Person person01 = new Person();
        System.out.println("age = " + person01.age + " name = " + person01.name 
        + " sal = " + person01.sal + " isPass = " + person01.isPass);
        //输出：age = 0 name = null sal = 0.0 isPass = false
    }
}
class Person {
    int age;
    String name;
    double sal;
    boolean isPass;
}
```

*对象之间赋值与数组类似，都是拷贝地址，指向的是同一个对象空间。*

*分析下述代码*

```java
public class Object01 {
    public static void main(String[] args) {
        Person a = new Person();
        a.age = 10;
        a.name = "小明";
        Person b;
        b = a;
        System.out.println(b.name); //小明
        b.age = 200;
        b = null;
        System.out.println(a.age);//200
        System.out.println(b.age);//异常
    }
}

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;
}
```

*注意：*可以通过编译，但是因为**b为null**，所以会抛出异常。

#### 成员方法

 *结合示意图分析方法的调用机制原理*

```java
public class Object02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        int returnRes = p1.getSum(10, 20);
        System.out.println("getSum方法返回的值 = " + returnRes);
    }
}

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;
    public int getSum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}
```

![Alt](.\images\方法调用机制.png)

**方法调用小结:**

- 当程序执行到方法时，就会开一个独立的空间(栈空间)
- 当方法执行完毕，或者执行到return语句时，就会返回
- 返回到调用方法的地方
- 返回后，继续执行方法后面的代码
- 当main方法(栈) 执行完毕，整个程序退出

**成员方法的好处：**

- 提高代码的复用性 
- 可以将实现的细节==封装==起来，然后供其他用户来调用即可

**成员方法定义语法：**

访问修饰符 返回数据类型 方法名(形参列表..) {//方法体 

​	语句;

​	return 返回值;

} 

- 形参列表：表示成员方法输入 cal(int n) ， getSum(int num1, int num2)
- 返回数据类型：表示成员方法输出, void 表示没有返回值
- 方法主体：表示为了实现某一功能代码块
- return 语句不是必须的

**成员方法使用细节：**

- 调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数，所谓兼容即为*实参向形参兼容*（int - > double √，byte - > int √，double - > int ×）
- 方法不能*嵌套定义*
- 一个方法最多有一个返回值（返回多个结果，可以使用数组、对象）
- **return**返回值的类型必须向*声明方法类型*兼容，规则同上述一致
- **void**方法可以使用**return**语句强制结束方法

**方法调用细节说明：**

- 同一个类中的方法调用：直接调用即可
- 跨类中的方法A类调用B类方法：需要通过对象名调用，即创建对象，调用语法：*对象名.方法名(参数)*
- 特别说明：跨类的方法调用和方法的*访问修饰符*相关

*课堂练习*

```java
import java.util.Scanner;

/* 
    编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数, 返回 boolean
 */
public class Method {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        AA a = new AA();
        System.out.println("请输入整数：");
        int n = cin.nextInt();
        if(a.isOdd(n))
            System.out.println(n + "是奇数");
        else
            System.out.println(n + "是偶数");
    }
}

class AA {
    boolean isOdd(int n) {
        return n % 2 != 0;
        //相比于if else以及三元运算符，这是比较简洁的写法
    }
}
```

*方法编写思路：*

1. 方法的返回类型
2. 方法的名字（见名知义）
3. 确定方法的形参
4. 编写方法体

#### 成员方法的传参机制

- 基本数据类型，传递的是值（值拷贝），形参的任何改变不影响实参
- 引用类型（数组、对象）传递的是地址，==可以通过形参影响实参==

*课堂练习*

```java
/* 
    编写一个方法 copyPerson，可以复制一个 Person 对象，
    返回复制的对象。克隆对象， 注意要求得到新对象
    和原来的对象是两个独立的对象，只是他们的属性相同
 */

public class Method {
    public static void main(String[] args) {
        Person p = new Person();
        Copy c = new Copy();
        p.name = "Jack_Ma";
        p.age = 50;
        Person p2 = c.copyPerson(p);
        System.out.println("p的名字 = " + p.name + "，p的年龄 = " + p.age);
        System.out.println("p的名字 = " + p2.name + "，p的年龄 = " + p2.age);
        System.out.println(p == p2);
    }
}

class Person {
    String name;
    int age;
}

class Copy {
    Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}
```

==注意：一定要动手敲代码，刚开始跨类调用方法编写还不熟练（编译频繁报错），多敲！==

#### 方法递归调用

*递归就是方法自己调用自己*,每次调用时传入不同的变量。递归有助于编程者解决复杂问题,同时可以让代码变 得简洁。（*但是可能会造成复杂度较高*）

其原理与C/C++类似，都是一层层方法调用栈，逐层返回。

**递归重要规则：**

- 执行一个方法时，就创建一个新的受保护的独立空间(栈空间)
- 方法的局部变量是独立的，不会相互影响，比如n变量
- 如果方法中使用的是引用类型变量(比如数组，对象)，就会共享该引用类型的数据
- 递归必须向退出递归的条件逼近，否则就是无限递归,出现*StackOverflowError*
- 当一个方法执行完毕，或者遇到return，就会返回遵守谁调用，就将结果返回给谁，同时当方法执行完毕或者返回时，该方法也就执行完毕

*课堂练习*

```java
/* 
    请使用递归的方式求出斐波那契数1,1,2,3,5,8,13..给你一个整数n，求出它的值是多
 */

import java.util.Scanner;

class RecursionExercise {
    public static void main(String[] args) {
        Scanner javain = new Scanner(System.in);
        Fibonacci f = new Fibonacci();
        int n;
        System.out.println("请输入一个正整数：");
        n = javain.nextInt();
        System.out.println("对应斐波那契数 = " + f.fibonacci(n));
    }
}

class Fibonacci {
    int fibonacci(int n) {
        if(n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

```

*建议用迭代，复杂度大大减小*

*课堂练习*

```java
import java.util.Scanner;

public class RecursionExercise01 {
    public static void main(String[] args) {
        /* 
            需求：
            猴子吃桃子问题:
            猴子吃桃子问题:有堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!
            以后每天猴子都吃其中的一半，然后再多吃一个。
            当到第10天时，想再吃时(即还没吃)发现只有1个桃子了。问题:最初共多少个桃子?
         */
        Scanner javain = new Scanner(System.in);
        int day, numsPeaches;
        System.out.println("请输入第几天：");
        day = javain.nextInt();
        EatPeaches eat = new EatPeaches();
        numsPeaches = eat.countpeaches(day);
        System.out.println("第天" + day + "时，桃子数量为" + numsPeaches);
    }
}

class EatPeaches {
    public int countpeaches(int n) {
        if(n == 10)
            return 1;
        else
            return (countpeaches(n + 1) + 1) * 2;
    }
}
```

**这题比较简单，搞清逆推规则就行。**

*迷宫寻找出口，左上角到右下角，*代码如下：

```java
import java.util.Scanner;
/* 
    需求：
    求解迷宫，从左上角走到右下角，用递归实现
 */
public class Maze {
    public static void main(String[] args) {
        Scanner javain = new Scanner(System.in);
        MazeCalculation maze = new MazeCalculation();
        int row, column;
        int[][] map;
        boolean isExit;
        System.out.println("请输入迷宫的行列数：");
        row = javain.nextInt();
        column = javain.nextInt();
        map = maze.mazeCreate(row, column);
        map[3][1] = 1;
        map[3][2] = 1;
        isExit = maze.exitFind(map, 1, 1);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println(isExit);
    }
}
class MazeCalculation {
    //创建(行数为row, 列数为column)迷宫
    public int[][] mazeCreate(int row, int column) {
        int[][] map = new int[row][column];
        for(int i = 0; i < row; i++)
            map[i][0] = map[i][column - 1] = 1;
        for(int i = 0; i < column; i++)
            map[0][i] = map[row - 1][i] = 1;
        return map;
    }
    //找寻出路，策略：下 右 上 左
    public boolean exitFind(int[][] map, int i, int j) {
        if(map[map.length - 2][map[0].length - 2] == 2)
            return true;
        else {
            if(map[i][j] == 0) {
                map[i][j] = 2;
                if(exitFind(map, i + 1, j))
                    return true;
                else if(exitFind(map, i, j + 1))
                    return true;
                else if(exitFind(map, i - 1, j))
                    return true;
                else if(exitFind(map, i, j - 1))
                    return true;
                else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
```

*分析代码：*

二维数组各元素：0表示可以走，1表示障碍物，2表示走过，3表示走过不过是死路。==注意下右上左处的代码部分，仔细分析。==

*递归实现汉诺塔*

```java
import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        Scanner javain = new Scanner(System.in);
        Move m = new Move();
        int n;
        char a, b, c;
        System.out.println("请输入层数：");
        n = javain.nextInt();
        a = 'A';
        b = 'B';
        c = 'C';
        m.moveTower(a, b, c, n);
    }
}

class Move {
    void moveTower(char a, char b, char c, int n) {
        if(n == 1) {
            System.out.println(a + "->" + c);
            return;
        } else {
            moveTower(a, c, b, n - 1);
            System.out.println(a + "->" + c);
            moveTower(b, a, c, n - 1);
        }
    }
}
```

*主要就是先把**n-1**块移到**b**，再把**最底下一块**移到**c**，最后把**n-1**块移到**c**。*

***八皇后问题（回溯经典问题）***==目前不会，学完回溯尝试解决==

```java
```

#### 方法重载

*java*中允许同一个类中，多个同名方法的存在，但要求形参列表不一致！比如：*System.out.println(); out*是**PrintStream**类型

**重载的好处：**

*减轻了起名/记名的麻烦（很多方法功能一致，只是形参列表不同，没必要定义不同的方法名）*

*示例代码：*

```java
public class OverLoad {
    public static void main(String[] args) {
        Mycalculator mc = new Mycalculator();
        System.out.println(mc.calculate(1, 2));
        System.out.println(mc.calculate(1.1, 2));
        System.out.println(mc.calculate(1, 2.1));
        System.out.println(mc.calculate(1, 2, 3));
    }
}

class Mycalculator {
    public int calculate(int n1, int n2) {
        System.out.println("第一个方法执行");
        return n1 + n2;
    }
    public double calculate(int n1, double n2) {
        System.out.println("第二个方法执行");
        return n1 + n2;
    }
    public double calculate(double n1, int n2) {
        System.out.println("第三个方法执行");
        return n1 + n2;
    }
    public int calculate(int n1, int n2, int n3) {
        System.out.println("第四个方法执行");
        return n1 + n2 + n3;
    }
}
```

**注意事项和使用细节：**

- 方法名：必须相同
- 形参列表：必须不同（形参类型或个数或顺序，至少有一样不同，参数名无要求）
- 返回类型：无要求

==小细节：调用方法时，会兼容参数类型但是优先调用类型一致的方法。==

*演示示例：*

```java
public class OverLoad {
    public static void main(String[] args) {
        Mycalculator mc = new Mycalculator();
        System.out.println(mc.calculate(1, 2));
    }
}

class Mycalculator {
    public double calculate(double n1, int n2) {
        System.out.println("兼容类型方法");
        return n1 + n2;
    }
    public double calculate(int n1, int n2) {
        System.out.println("参数一致方法");
        return n1 + n2;
    }
}
```

*代码执行输出"参数一致方法"，但是如果没有方法2，也会调用执行方法1，输出"兼容类型方法"。*

#### 可变参数

java允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法。就可以通过可变参数实现

*基本语法：*

访问修饰符 返回类型 方法名(==数据类型...== 形参名) {

}

*示例代码：*

```java
public class VarParameter {
    public static void main(String[] args) {
        HspMethod getsum = new HspMethod();
        System.out.println(getsum.sum(1, 2, 3, 4));
        System.out.println(getsum.sum(1, 2, 3, 4, 100));
    }
}

class HspMethod {
    public int sum(int... nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++)
            res += nums[i];
        return res;
    }
}
```

*代码解读：*

- int... 表示接受的是可变参数，类型是 int ，即可以接收多个 int(0-多) 
- 使用可变参数时，可以当做**数组**来使用，即 nums 可以当做数组 
- 遍历 nums 求和即可

*注意事项和使用细节：*

- 可变参数的实参可以为0个或任意多个
- 可变参数的实参可以为数组
- 可变参数的本质就是数组
- 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
- 一个形参列表中只能出现一个可变参数

#### 作用域

在类中，属性（全局变量）可以不赋值直接使用，因为有默认值；而局部变量必须赋值后，才能使用，因为没有默认值。

```java
public class VarScope {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.hi();
    }
}

class Cat {
    int age = 10;
    //全局变量（weight）可以不赋值，直接使用，默认0.0
    double weight;
    public void hi() {
        //局部变量必须赋值
        int num = 1;
        String address = "北京的猫";
        System.out.println("num=" + num);
        System.out.println("address=" + address);
        System.out.println("weight=" + weight);//0.0
    }
}
```

**注意事项和使用细节：**

- 属性和局部变量可以重名，访问时遵循就近原则
- 全局变量/属性可以加修饰符，局部变量不可以加修饰符

#### 构造方法/构造器

**基本说明：**

- 构造器的修饰符可以默认，也可以是**public protected private**
- 构造器没有返回值
- 方法名和类名字必须一样
- 参数列表和成员方法一样的规则
- 构造器的调用，由系统完成

**注意事项和使用细节：**

- 一个类可以定义多个不同的构造器，即构造器重载
- 创建对象时，系统自动调用该类的构造方法
- 如果没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
- 一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器，除非显式的定义无参构造器

*课堂练习：*

```java
/* 
 * 需求：
 * 在前面定义的 Person 类中添加两个构造器：
 * 第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为 18
 * 第二个带 pName 和 pAge 两个参数的构造器：
 * 使得每次创建 Person 对象的同时初始化对象的 age 属性值和 name 属性值
 * 分别使用不同的构造器，创建对象.
 */
public class ConstructorExercise {

    public static void main(String[] args) {
        Person xiaomin = new Person();
        Person xiaohong = new Person("小红", 24);
        System.out.println(xiaomin.name + xiaomin.age);
        System.out.println(xiaohong.name + xiaohong.age);
    }
}

class Person {
    String name;
    int age;
    Person() {
        this.age = 18;
    }
    Person(String pName, int pAge) {
        this.name = pName;
        this.age = pAge;
    }

}
```

#### this关键字

**注意事项和使用细节：**

- 访问构造器语法，注意只能在构造器中使用（即只能在构造器中访问另外一个构造器，==必须放在第一条语句==）
- this不能在类定义的外部使用，只能在类定义的方法中使用

### 第8章 面向对象编程（中级部分）

#### IDE（集成开发环境）-IDEA

**IDEA常用快捷键：**

- 删除当前行，ctrl + Y
- 复制当前行，ctrl + D
- 当前行上移/下移，ctrl + shift + ↑/↓
- 选中相同单词，alt + J
- 添加和取消注释，ctrl + /
- 添加多行注释，ctrl + shift + /
- 自动导包，光标悬停在目标位置 alt + Enter
- 运行代码快捷键，ctrl + shift + F10
- 快速格式化代码，ctrl + alt + L
- 生成构造器,toString等即generate，alt + insert
- 查看一个类的层级继承关系，ctrl + H
- 查看当前类中的所有成员:方法、属性、内部类，ctrl + F12
- 将光标放在一个方法上，输入ctrl + B，可以定位到方法

#### IDE（集成开发环境）-Eclipse

**Eclipse常用快捷键：**

- 删除当前行，ctrl + D
- 向上/向下复制当前行，ctrl + alt + ↑/↓
- 当前行上移/下移，alt + ↑/↓
- 参照选中的Word快速定位到下一个，ctrl + K
- 添加/取消单行注释，ctrl + /
- 添加/取消多行注释，ctrl + shift + /，ctrl + shift + \
- 自动导包，ctrl + shift + O
- 运行代码，ctrl + F11
- 快速格式化代码，ctrl + shift + F

- 生成构造器,getter,setter,toString等，alt + shift + S
- 查看一个类的层级继承关系，ctrl + T
- 查看当前类中的所有成员:方法、属性、内部类，ctrl + O
- 调出Outline视窗，alt + shift + Q 选择 O
- 选中方法、类，ctrl + 左键
- 代码自动补全，alt + /
- main，alt + /；syso，alt + /
- 代码回退，ctrl + Z
- 代码前进，ctrl + Y

#### 包

**包的三大作用：**

1. 区分相同名字的类
2. 当类很多时,可以很好的管理类
3. 控制访问范围

**包的基本语法：**

*package com.xlbedu;*

**package**关键字，表示打包

**com.xlbedu**表示包名

**包的命名规范：**

域名反转，小写字母+小圆点

**引入包：**

import 包；

建议需要使用哪个类，就导入哪个类即可，不建议使用*导入

**注意事项和使用细节：**

- package的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多只有一句package
- import指令位置放在package的下面，在类定义前面，可以有多句且没有顺序要求

#### 访问修饰符

java提供四种访问控制修饰符号，用于控制方法和属性（成员变量）的访问权限（范围）：

| 访问级别 | 访问控制修饰符 | 同类 | 同包 | 子类 | 不同包 |
| -------- | -------------- | ---- | ---- | ---- | ------ |
| 公开     | public         | √    | √    | √    | √      |
| 受保护   | protected      | √    | √    | √    | ×      |
| 默认     | 没有修饰符     | √    | √    | ×    | ×      |
| 私有     | private        | √    | ×    | ×    | ×      |

**注意事项：**

- 修饰符可以用来修饰类中的属性，成员方法以及类
- 只有默认和public才能修饰类，并且遵循上述访问权限的特点
- 成员方法的访问规则和属性完全一样

#### 面向对象编程三大特征

面向对象编程有三大特征：封装、继承和多态

**封装：**

封装就是把抽象出的数据[属性]和对数据的操作[方法]封装在一起，数据被保护在内部，程序的其它部分只有通过被授权的操作[方法]，才能对数据进行操作。

**封装的理解和好处：**

1. 隐藏实现细节：方法(连接数据库)< --调用(传入参数..)
2. 可以对数据进行验证，保证安全合理

**封装的实现步骤（三步）：**

1. 将属性进行私有化private[不能直接修改属性]

2. 提供一个公共的(public)set方法，用于对属性判断并赋值

   public void setXxx(类型参数名){//Xxx表示某个属性

   //加入数据验证的业务逻辑
   属性=参数名;

   }

3. 提供一个公共的(public)get方法，用于获取属性的值
   public 数据类型 getXxx(){//权限判断,Xxx某个属性
   return xx;
   }

**构造器中可以写set方法**，代码如下：

```java
public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
    setName(name);
    setAge(age);
    setSalary(salary);
}
```

此时通过构造器创建对象时，set方法的数据验证仍然生效

**继承：**

继承可以解决代码复用，让我们的编程更加靠近人类思维。当多个类存在相同的属性(变量)和方法时，可以从这些类中抽象出父类，在父类中定义这些相同的属性和方法，所有的子类不需要重新定义这些属性和方法，只需要通过extends来声明继承父类即可。

**继承的基本语法：**

class 子类 extends 父类 {

}

- 子类会自动拥有父类定义的属性和方法
- 父类又称为超类、基类，子类又称为派生类

**继承带来的便利：**代码的复用性、扩展性以及维护性提高了

**继承的使用细节：**

- 子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问，但是私有属性和方法不能在子类直接访问，要通过父类提供公共的方法去访问
- 子类必须调用父类的构造器， 完成父类的初始化
- 当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类没有提供无参构造器，则必须在子类的构造器中用super去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过
- 如果希望指定去调用父类的某个构造器，则显式的调用一下，super(参数列表)
- super 在使用时，必须放在构造器第一行(super 只能在构造器中使用)
- super()和this()都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
- java 所有类都是Object 类的子类，Object 是所有类的基类
- 父类构造器的调用不限于直接父类，将一直往上追溯直到Object 类(顶级父类)
- 子类最多只能继承一个父类(指直接继承)，即 java 中是单继承机制
-  不能滥用继承，子类和父类之间必须满足 is-a

**当子类对象创建好后，建立查找的关系：**

1. 首先看子类是否有该属性，若有并且可以访问，则返回信息
2. 若子类没有该属性，看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息..)
3. 如果父类没有就按照(2)的规则，继续找上级父类，直到Object...
4. 注意如果查找到父类private属性，则查找终止/失败，不论父类的父类是否有可以访问的该属性

==查找方法规则与属性一致==

*分析下述代码：*

```java
public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    A() {
        System.out.println("a");
    }
    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }
    B(String name) {
        System.out.println("b name");//分析有默认的super();
    }
}
//输出
/*
a
b name
b
*/
```

==构造器中this()与super()只能存在一个，而super()不编写时，会隐式存在，当编写了this()时，super()就不再运行==

**分析代码：**

```java
public class ExtendsExercise02 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    public A() {
        System.out.println("我是 A 类");
    }
}

class B extends A {
    public B() {
        System.out.println("我是 B 类的无参构造");
    }

    public B(String name) {
        System.out.println(name + "我是 B 类的有参构造");
    }
}

class C extends B {
    public C() {
        this("hello");
        System.out.println("我是 C 类的无参构造");
    }
    public C(String name) {
        super("hahaha");
        System.out.println("我是 C 类的有参构造");
    }
}

//输出
/*
我是 A 类
hahaha我是 B 类的有参构造
我是 C 类的有参构造
我是 C 类的无参构造
*/
```

分析方法同上

#### super关键字

super代表父类的引用，用于访问父类的属性、方法、构造器

**基本语法：**

- 访问父类的属性，但不能访问父类的private属性，super.属性名
- 访问父类的方法，不能访问父类的private方法，super.方法名(参数列表)
- 访问父类的构造器，super(参数列表)；只能放在构造器的第一句，只能出现一句，不能与this()并存，默认隐式运行super()

**super使用的便利：**

- 调用父类构造器的好处（分工明确，父类属性由父类初始化，子类属性由子类初始化）
- 当子类中有和父类中的成员（属性和方法）重名时，为了访问父类的成员，必须
  通过super；如果没有重名，使用super、this、直接访问是一样的效果
- super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员；如果多个基类(上级类)中都有同名的成员，使用super访问遵循就近原则，当然也需要遵守访问权限的相关规则

**super和this的比较：**

| No   | 区别点     | this                                                   | super                                    |
| ---- | ---------- | ------------------------------------------------------ | ---------------------------------------- |
| 1    | 访问属性   | 访问本类中的属性，如果本类没有此属性则从父类中继续查找 | 从父类开始查找属性                       |
| 2    | 调用方法   | 访问本类中的方法，如果本类没有此方法则从父类继续查找   | 从父类开始查找方法                       |
| 3    | 调用构造器 | 调用本类构造器，必须放在构造器的首行                   | 调用父类构造器，必须放在子类构造器的首行 |
| 4    | 特殊       | 表示当前对象                                           | 子类中访问父类对象                       |

#### 方法重写/覆盖（override）

方法重写/覆盖就是子类有一个方法，和父类的某个方法的名称、返回类型、参数一样，那么我们就说子类的这个方法重写了父类的方法

**使用细节：**

- 子类的方法的形参列表，方法名称，要和父类方法的形参列表，方法名称完全一样
- 子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类
  比如父类返回类型是Object ,子类方法返回类型是String
- 子类方法不能缩小父类方法的访问权限 public > protected >默认>private

| 名称           | 发生范围 | 方法名   | 形参列表                         | 返回类型                                                     | 修饰符                             |
| -------------- | -------- | -------- | -------------------------------- | ------------------------------------------------------------ | ---------------------------------- |
| 重载(overload) | 本类     | 必须一样 | 类型，个数或者顺序至少有一个不同 | 无要求                                                       | 无要求                             |
| 重写(override) | 父子类   | 必须一样 | 相同                             | 子类重写的方法，返回的类型和父类返回的类型一致，或者是其子类 | 子类方法不能缩小父类方法的访问范围 |

#### 面向对象编程-多态

多态：方法或对象具有多种形态，是面向对象的第三大特征，多态是建立在封装和继承基础之上的 

- 一个对象的编译类型和运行类型可以不一致
- 编译类型在定义对象时，就确定了，不能改变
- 运行类型是可以变化的
- 编译类型看定义时 = 号的左边，运行类型看 = 号的右边

多态的==前提：==两个对象存在**继承**关系

**向上转型：**

- 本质：父类的引用指向了子类的对象

- 语法：父类类型 引用名 = new 子类类型();

- 特点：编译类型看左边，运行类型看右边

  可以调用父类的所有成员（需遵守访问权限）

  不能调用子类中特有成员

  最终运行效果看子类的具体实现

**向下转型：**

- 语法：子类类型 引用名 = (子类类型) 父类引用
- 只能强转父类的引用，不能强转父类的对象
- 要求父类的引用必须指向的是当前目标类型的对象
- 向下转型后，可以调用子类类型中所有的成员（包括特有成员）

**属性没有重写之说，属性的值看编译类型** *分析下述代码*

```java
public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);//10
        Sub base_sub = (Sub) base;
        System.out.println(base_sub.count);//20
        Sub sub = new Sub();
        System.out.println(sub.count);//20
    }
}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}
```

**instanceOf:**比较操作符，用于判断对象的==运行类型==是否为XX类型或XX类型的子类型

**Java的动态绑定机制：**

- 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
- 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用

```java
public class DynamicBinding {
    public static void main(String[] args) {
    //a 的编译类型 A, 运行类型 B
        A a = new B();//向上转型
        System.out.println(a.sum());//40 -> 30
        System.out.println(a.sum1());//30 -> 20
    }
}
class A {//父类
    public int i = 10;
    //动态绑定机制:
    public int sum() {//父类 sum()
        return getI() + 10;//20 + 10
    }
    public int sum1() {//父类 sum1()
        return i + 10;//10 + 10
    }
    public int getI() {//父类 getI
        return i;
    }
}
class B extends A {//子类
    public int i = 20;
//     public int sum() {
//        return i + 20;
//     }
     public int getI() {//子类 getI()
        return i;
     }
//     public int sum1() {
//        return i + 10;
//     }
}
```

**分析：**

==注意：==运行a.sum()时，会调用父类的sum()（因为子类的sum()注释了），此时会执行getI() + 10，这时会调用==运行类型而不是编译类型==的getI()，即会调用子类的getI()，所以输出 20 + 10 = 30

**多态的应用：**

- 多态数组

数组的定义类型为父类类型，里面保存的实际元素类型为子类类型

- 多态参数

方法定义的形参类型为父类类型，实参允许为子类类型

#### Object 类详解

**== 和 equals 的对比：**

== 是一个比较运算符

1. 既可以判断基本类型，又可以判断引用类型
2. 如果判断基本类型，判断的是值是否相等
3. 如果判断引用类型，判断的是地址是否相等，即判断是不是同一个对象

equals 是Object类中的方法

1. 只能判断引用类型
2. 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等。比如 Integer，String

==注意细节，Integer自动拆装箱（-128 ~ 127），String == 判断（具体详细解释看笔记）==

**hashCode()：**

- 提高具有哈希结构的容器的效率
- 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的
- 两个引用，如果指向的是不同对象，则哈希值是不一样的
- 哈希值主要根据地址号来的，不能完全将哈希值等价于地址

**toString方法：**

- 默认返回：全类名 + @ + 哈希值的十六进制，子类往往重写toString方法，用于返回对象的属性信息（如：com.hspedu.object_.AA@1b6d3586）
- 重写toString方法，打印对象或拼接对象时，会自动调用该对象的toString方法
- 当直接输出一个对象时，toString方法会默认的调用，比如 System.out.println(aa): 会默认调用 aa.toString() 

**finalize方法：**

- 当对象被回收时，系统自动调用该对象的 finalize 方法。子类可以重写该方法，做一些释放资源的操作
- 当某个对象没有任何引用时，则 jvm 就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来销毁该对象，在销毁该对象前，会先调用 finalize 方法
- 垃圾回收机制的调用，是由系统来决定(即有自己的 GC 算法), 也可以通过 System.gc() 主动触发垃圾回收机制

#### 断点调试

1. 断点调试是指在程序的某一行设置一个断点，调试时，程序运行到这一行就会停住，然后你可以一步一步往下调试，调试过程中可以看各个变量当前的值，报错的话，调试到出错的代码行即显示错误，停下，进行分析从而找到这个Bug
2. 断点调试是程序员必须掌握的技能
3. 断点调试也能帮助我们查看java底层源代码的执行过程，提高程序员的Java水平

**断点调试的快捷键：**

- F7(跳入) 即跳入方法内
- Alt + Shift + F7 强制跳入方法内
- F8(跳过) 逐行执行代码
- shift + F8(跳出) 跳出方法
- F9(resume,执行到下一个断点) 

可以在 debug 过程中，动态地下断点

### 第9章 项目-房屋出租系统

#### 房屋出租系统-需求

实现基于文本界面的《房屋出租软件》。能够实现对房屋信息的添加、修改和删除（用数组实现），并能够打印房屋明细表

**关键点：**

采用面向对象编程思想，项目界面封装成方法，新增、查找、删除等等均封装成单独的方法，在主页面方法中调用。

### 第10章 面向对象编程（高级部分）

#### 类变量和类方法

- 类变量是所有同类对象共享的，修改会同步到所有实例的类变量

- 类变量也叫静态变量/静态属性，是该类的所有对象共享的变量,任何一个该类的对象去访问它时，取到的都是相同的值，同样任何一个该类的对象去修改它时,修改的也是同一个变量

- 类变量是在类加载时就初始化了，也就是说，即使你没有创建对象，只要类加载了就可以使用类变量了

**类变量定义语法：**

访问修饰符 static 数据类型 变量名;

**类变量访问：**

类名.类变量名 或者 对象名.类变量名

推荐使用：类名.类变量名

**类变量使用细节：**

- 当我们需要让某个类的所有对象都共享一个变量时，就可以考虑使用类变量(静态变量):比如:定义学生类，统计所有学生共交多少钱
- 类变量是该类的所有对象共享的，而实例变量是每个对象独享的
- 加上static称为类变量或静态变量，否则称为实例变量/普通变量/非静态变量
- 类变量可以通过类名.类变量名或者对象名.类变量名来访问，但java设计者推荐我们使用类名.类变量名方式访问
- 实例变量不能通过类名.类变量名方式访问
- 类变量是在类加载时就初始化了，也就是说，即使你没有创建对象，只要类加载了，就可以使用类变量了
- 类变量的生命周期是随类的加载开始，随着类消亡而销毁

**类方法基本介绍：**

类方法也叫静态方法，基本语法如下：

访问修饰符 static 数据返回类型 方法名(){ }

**类方法的调用：**

类名.类方法名 或者 对象名.类方法名

**类方法的使用场景：**

当方法中不涉及到任何和对象相关的成员，则可以将方法设计成静态方法，提高开发效率

**类方法使用细节：**

- 类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区:类方法中无this的参数，普通方法中隐含着this的参数
- 类方法可以通过类名调用，也可以通过对象名调用
- 普通方法和对象有关，需要通过对象名调用，比如对象名.方法名(参数)，不能通过类名调用
- 类方法中不允许使用和对象有关的关键字，比如this和super。普通方法(成员方法)可以
- 类方法(静态方法)中只能访问静态变量或静态方法
- 普通成员方法,既可以访问非静态成员，也可以访问静态成员
- 静态方法，只能访问静态的成员，非静态的方法，可以访问静态成员和非静态成员(必须遵守访问权限)

==注意：静态方法不能被重写==

#### 理解main方法语法

main方法的形式：**public static void main(String[] args){}**

1. main方法时虚拟机调用
2. java虚拟机需要调用类的main()方法，所以该方法的访问权限必须是public
3.  java虚拟机在执行main()方法时不必创建对象，所以该方法必须是static
4. 该方法接收String类型的数组参数，该数组中保存执行java命令时传递给所
   运行的类的参数
5. java 执行的程序 参数1 参数2 参数3
6. dos命令行中执行传参直接在后面输入就行，Eclipse和Idea在窗口中设置传入参数

#### 代码块

- 代码化块又称为初始化块,属于类中的成员[即是类的一部分]，类似于方法，将逻辑语句封装在方法体中，通过{}包围起来
- 但和方法不同，没有方法名，没有返回，没有参数，只有方法体，而且不用通过对象或类显式调用，而是加载类时，或创建对象时隐式调用

**基本语法：**

修饰符 {

​	代码

};

- 修饰符 可选，要写的话，只能写static
- 代码块分为两类，使用static修饰的叫静态代码块，没有static修饰的，叫普通代码块/非静态代码块
- { }中可以为任何逻辑语句（输入、输出、方法调用、循环、判断等）
- ; 号可以写上，也可以省略

**代码块的好处：**

- 相当于另外一种形式的构造器(对构造器的补充机制)，可以做初始化的操作
- 如果多个构造器中都有重复的语句，可以抽取到初始化块中，提高代码的复用性

**代码块使用细节：**

- static代码块也叫静态代码块，作用就是对类进行初始化，而且它随着类的加载而执行，并且只会执行一次。如果是普通代码块，每创建一个对象，就执行一次
- 类什么时候被加载
  1. 创建对象实例时(new)
  2. 创建子类对象实例，父类也会被加载
  3. 使用类的静态成员时(静态属性，静态方法)
- 普通的代码块，在创建对象实例时，会被隐式的调用。被创建一次，就会调用一次。如果只是使用类的静态成员时，普通代码块并不会执行

**构造方法的调用顺序：**

1. 父类的静态代码块和静态属性初始化(优先级一样，按定义顺序执行)
2. 子类的静态代码块和静态属性初始化(优先级一样，按定义顺序执行)
3. 父类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
4. 父类的构造方法
5. 子类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
6. 子类的构造方法

**分析说明：**

1. 进行类的加载
   - 先加载父类
   - 再加载子类
2. 再创建对象
   - 从子类的构造器开始==注意隐式super()和普通代码块==


==注意：父类的构造方法优先于子类的普通代码块和普通属性初始化==

*静态代码块只能直接调用静态成员(静态属性和静态方法)，普通代码块可以调用任意成员*

#### 单例设计模式

**设计模式介绍：**

- 静态方法和属性的经典使用
- 设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式。设计模式就像是经典的棋谱，不同的棋局，我们用不同的棋谱，免去我们自己再思考和摸索

**单例模式：**

单例(单个的实例)

- 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某
  个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法
- 单例模式有两种方式：1）饿汉式 2）懒汉式

**单例模式的实现：**

- 构造器私有化 - > 防止直接 new
- 类的内部创建对象
- 向外暴露一个静态的公共方法

**饿汉式VS懒汉式：**

- 二者最主要的区别在于创建对象的时机不同：饿汉式是在类加载就创建了对象实例，而懒汉式是在使用对象时才创建
- 饿汉式不存在线程安全问题，懒汉式存在线程安全问题
- 饿汉式存在浪费资源的可能

#### final关键字

final 中文意思：最后的,最终的

final 可以修饰类、属性、方法和局部变量

在某些情况下,程序员可能有以下需求，就会使用到final

- 当不希望类被继承时,可以用final修饰
- 当不希望父类的某个方法被子类覆盖/重写(override)时,可以用final关键字修饰
- 当不希望类的的某个属性的值被修改,可以用final修饰
- 当不希望某个局部变量被修改，可以使用final修饰

**final使用细节：**

1. final修饰的属性又叫常量，一般用XX_XX_XX来命名
2. final修饰的属性在定义时，必须赋初值，并且以后不能再修改，赋值可以在如下位置之一[选择一个位置赋初值即可]:

   - 定义时
   - 在构造器中
   - 在代码块中
3. 如果final修饰的属性是静态的，则初始化的位置只能是

   - 定义时

   - 在静态代码块中，不能在构造器中赋值
4. final类不能继承，但是可以实例化对象
5. 如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承
6. 一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法
7. final不能修饰构造方法(即构造器)
8. final和static往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理
9. 包装类(Integer, Double, Float, Boolean等都是final类), String也是final类

#### 抽象类

当父类的某些方法需要声明，但是又不确定如何实现时，可以将其声明为抽象方法，那么这个类就是抽象类。

**基本介绍：**

- 用abstract关键字来修饰一个类时，这个类就叫抽象类

  访问修饰符 abstract 类名 {
  }

- 用abstract关键字来修饰一个方法时，这个方法就是抽象方法

  访问修饰符 abstract 返回类型 方法名(参数列表)；//没有方法体

- 抽象类的价值更多作用是在于设计，是设计者设计好后，让子类继承并实现抽象类()

**使用细节：**

- 抽象类不能被实例化
- 抽象类不一定要包含 abstract 方法，也就是说，抽象类可以没有 abstract 方法
- 一旦类包含了 abstract 方法，则这个类必须声明为 abstract
- abstract 只能修饰类和方法，不能修饰属性和其它的
- 抽象类可以有任意成员 [抽象类本质还是类] ，比如：非抽象方法、构造器、静态属性等等
- 抽象方法不能有主体，即不能实现
- 如果一个类继承了抽象类，则它必须实现抽象类的*所有*抽象方法，除非它自己也声明为abstract类
- 抽象方法不能使用private、final和static来修饰，因为这些关键字都是和重写相违背的

#### 抽象类最佳实践 - 模板设计模式

**基本介绍：**

抽象类体现的就是一种模板模式的设计，抽象类作为多个子类的通用模板，子类在抽象类的基础上进行扩展、改造，但子类总体上会保留抽象类的行为方式。

**模板设计模式能解决的问题：**

- 当功能内部一部分实现是确定，一部分实现是不确定的。这时可以把不确定的部分暴露出去，让子类去实现
- 编写一个抽象父类，父类提供了多个子类的通用方法，并把一个或多个方法留给其子类实现，就是一种模板模式

#### 接口

**基本介绍：**

- 接口就是给出一些没有实现的方法，封装到一起，到某个类要使用的时候,在根据具体情况把这些方法写出来

- 语法：
  interface 接口名 {

  //属性
  //抽象方法

  }
  class 类名 implements 接口 {
  自己属性;
  自己方法;
  必须实现的接口的抽象方法

  }

- 小结：接口是更加抽象的抽象类，抽象类里的方法可以有方法体，接口里的所有方法都没有方法体 [ jdk7.0 ] 。接口体现了程序设计的多态和高内聚低偶合的设计思想。==特别说明：jdk8.0后接口类可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现==

**接口使用细节：**

1. 接口不能被实例化
2. 接口中所有的方法是 public 方法，接口中抽象方法，可以不用 abstract 修
   饰
3. 一个普通类实现接口，就必须将该接口的所有方法都实现
4. 抽象类实现接口，可以不用实现接口的方法
5. 一个类可以同时实现多个接口
6. 接口中的属性，只能是final的，而且是 public static final 修饰符。比如:
   int a = 1; 实际上是 public static final int a = 1; (必须初始化)
7. 接口中属性的访问形式：接口名.属性名
8. 接口不能继承其它的类，但是可以继承多个别的接口
   例如，interface A extends B, C{ }
9. 接口的修饰符只能是public 和默认，这点和类的修饰符是一样的

**接口Vs继承：**

- 接口和继承解决的问题不同
  继承的价值主要在于：解决代码的复用性和可维护性。
  接口的价值主要在于：设计，设计好各种规范(方法)，让其它类去实现这些方法，即更加的灵活
- 接口比继承更加灵活
  接口比继承更加灵活，继承是满足is - a的关系，而接口只需满足like - a的关系
- 接口在一定程度上实现代码解耦 [ 即：接口规范性 + 动态绑定机制 ]

**接口实现多态：**

- 接口也可以实现多态参数、多态数组
- 接口存在多态传递现象，见下述代码

```java
public class InterfacePolyPass {
	public static void main(String[] args) {
		IH ih = new Teacher();
	}
}

interface IH {
	void hi();
}

interface IG extends IH {
	
}

class Teacher implements IG {
	@Override
	public void hi() {
		
	}
}
```

分析：IG 继承了 IH 接口，而 Teacher 类实现了 IG 接口，那么，实际上就相当于 Teacher 类也实现了 IH 接口。这就是所谓的接口多态传递现象

#### 内部类

如果定义类在局部位置(方法中/代码块)：(1) 局部内部类 (2) 匿名内部类

定义在成员位置：(1) 成员内部类 (2) 静态内部类

**基本介绍：**

一个类的内部又完整的嵌套了另一个类结构，被嵌套的类称为内部类（inner class），嵌套其他类的类称为外部类（outer class）。是我们类的第五大成员 [ 思考：类的五大成员是哪些？[属性、方法、构造器、代码块、内部类] ] ，内部类最大的特点就是可以直接访问私有属性，并且可以体现类与类之间的包含关系，注意：内部类是学习的难点，同时也是重点，后面看底层源码时，有大量的内部类。

**基本语法：**

class Outer {//外部类

​	class Inner {//内部类

​	}

}

class Other {//外部其他类

}

**内部类的分类：**

- 定义在外部类局部位置上（比如方法内）
  - 局部内部类（有类名）
  - 匿名内部类（没有类名)
- 定义在外部类的成员位置上
  - 成员内部类（没用static修饰）
  - 静态内部类（使用static修饰）

**局部内部类的使用：**

说明:局部内部类是定义在外部类的局部位置，比如方法中，并且有类名。

1. 可以直接访问外部类的所有成员，包含私有的

2. 不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量是不能使用修饰符的。但是可以使用final修饰，因为局部变量也可以使用final

3. 作用域：仅仅在定义它的方法或代码块中

4. 局部内部类 - 访问 - > 外部类的成员 [ 访问方式：直接访问 ] 

5. 外部类 - 访问 - > 局部内部类的成员，访问方式：创建对象，再访问（注意：必须在作用域内）

   记住:

   - 局部内部类定义在方法中/代码块
   - 作用域在方法体或者代码块中
   - 本质仍然是一个类

6. 外部其他类 - 不能访问 - > 局部内部类（因为局部内部类地位是一个局部变量）

7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问，如下
   System.out.printIn("外部类的n2 = " + 外部类名.this.n2);

**匿名内部类的使用：**

- 本质是类
- 内部类
- 该类没有名字
- 同时还是一个对象，==说明匿名内部类是定义在外部类的局部位置，比如方法中，并且没有类名==

**匿名内部类的使用细节：**

1. 匿名内部类的基本语法

   new 类或接口(参数列表) {

   ​	类体

   }

2. 匿名内部类的语法比较奇特，请大家注意，因为匿名内部类既是一个类的定义，同时它本身也是一个对象，因此从语法上看，它既有定义类的特征，也有创建对象的特征，因此可以调用匿名内部类方法

3. 可以直接访问外部类的所有成员，包含私有的

4. 不能添加访问修饰符，因为它的地位就是一个局部变量

5. 作用域：仅仅在定义它的方法或代码块中

6. 匿名内部类 - 访问 - > 外部类成员 [ 访问方式：直接访问 ]

7. 外部其他类 - 不能访问 - > 匿名内部类（因为匿名内部类地位是一个局部变量）

8. 如果外部类和匿名内部类的成员重名时，匿名内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问

**匿名内部类示例代码：**

```java
public class AnonymousInnerClass {
	public static void main(String[] args) {
		Outer04 outer04 = new Outer04();
		outer04.method();
	}
}

class Outer04 {
	private int n1 = 10;

	public void method() {
		IA tiger = new IA() {
			@Override
			public void cry() {
				System.out.println("老虎叫唤...");
			}
		};
		System.out.println("tiger 的运行类型 = " + tiger.getClass());
		tiger.cry();
		tiger.cry();
		tiger.cry();
		Father father = new Father("jack") {
			@Override
			public void test() {
				System.out.println("匿名内部类重写了 test 方法");
			}
		};
		System.out.println("father 对象的运行类型 = " + father.getClass());
		father.test();
		Animal animal = new Animal() {
			@Override
			void eat() {
				System.out.println("小狗吃骨头...");
			}
		};
	}
}

interface IA {
	public void cry();
}

class Father {
	public Father(String name) {
		System.out.println("接收到 name = " + name);
	}

	public void test() {

	}
}

abstract class Animal {
	abstract void eat();
}
```

## SSM框架

### Spring



