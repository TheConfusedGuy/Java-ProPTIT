# Buổi 4: Mọi thứ đều là đối tượng
## 1. Tính đóng gói
### a. Tính đóng gói là gì
- **Tính đóng gói (Encapsulation)** là một trong những nguyên tắc quan trọng trong Lập Trình Hướng Đối Tượng (OOP). Nguyên tắc này đề cập đến việc **che giấu thông tin và hành vi bên trong đối tượng**, chỉ tiết lộ những gì cần thiết và quy định cách truy cập thông qua các phương thức công khai. 
### b. Vì sao cần tính đóng gói
- Trong lập trình, tính đóng gói giúp **bảo vệ dữ liệu và tránh truy cập trực tiếp** đến các thuộc tính của đối tượng từ bên ngoài. Điều này có ích trong việc **quản lý và bảo vệ dữ liệu**, đồng thời cho phép kiểm soát cách các thành phần khác nhau tương tác với đối tượng đó.
### c. Ví dụ:
- Trong lớp Student có thuộc tính name được đặt là private để không thể được truy cập trực tiếp từ bên ngoài mà phải qua 2 phương thức là getName và setName.
```java
 
public class Student{   
	private String name;  

	public String getName(){  
		return name;  
	}  
  
	public void setName(String name){  
		this.name=name  
	}  
}
```
## 2. Tính kế thừa trong Java
### a. Tính kế thừa là gì?
- **Kế thừa (Inheritance)** là một trong những khía cạnh quan trọng nhất của Lập Trình Hướng Đối Tượng (OOP). Nó cho phép bạn **tạo ra các lớp mới bằng cách sử dụng thông tin và hành vi từ các lớp đã tồn tại.**
### b. Vì sao cần kế thừa
- Tính kế thừa giúp **tái sử dụng mã nguồn và tạo ra cấu trúc phân cấp cho các lớp.** Điều này cho phép bạn xây dựng các lớp mới trên cơ sở của các lớp đã có, tiết kiệm thời gian và công sức, đồng thời duy trì tính nhất quán trong mã nguồn.
### c. Cú pháp
```java
class Subclass-name extends Superclass-name{
    //methods and fields
}
```
- Ví dụ:
```java
public class Student{   
	private String name;  

	public String getName(){  
		return name;  
	}  
  
	public void setName(String name){  
		this.name=name  
	}  
}
class Fresher extends Student{

}
```
### d. Các kiểu kế thừa
- Có 3 kiểu kế thừa trong java đó là đơn kế thừa, kế thừa nhiều cấp, kế thừa thứ bậc.
![[Pasted image 20231113103020.png]]
- **Đơn kế thừa**: Một lớp con kế thừa với một lớp cha.
```java
public class Person{   
	private String name;  

	public String getName(){  
		return name;  
	}  
  
	public void setName(String name){  
		this.name=name  
	}  
}
class Student extends Person{

}
```
- **Kế thừa nhiều tầng**: Các lớp nối đuôi nhau kế thừa.
```java
public class Person{   
	private String name;  

	public String getName(){  
		return name;  
	}  
  
	public void setName(String name){  
		this.name=name  
	}  
}
class Student extends Person{

}
class Fresher extends Student{

}
```
- **Kế thừa thứ bậc**: Hai lớp con kế thừa 1 lớp cha.
```java
public class Person{   
	private String name;  

	public String getName(){  
		return name;  
	}  
  
	public void setName(String name){  
		this.name=name  
	}  
}
class Student extends Person{

}
class Adult extends Person{

}
```
## 3. Tính đa hình
### a. Tính đa hình là gì?
- **Tính đa hình (Polymorphism)** là một khía cạnh quan trọng trong Lập Trình Hướng Đối Tượng (OOP). Nó cho phép bạn thực hiện cùng một hành động trên các đối tượng khác nhau mà không cần quan tâm đến loại đối tượng cụ thể.
### b. Vì sao cần tính đa hình
- Tính đa hình giúp tạo ra **mã nguồn linh hoạt và dễ bảo trì**. Nó cho phép bạn viết các phương thức chung mà có thể được sử dụng trên nhiều lớp khác nhau, **giúp giảm sự lặp lại mã và tạo ra mã nguồn dễ mở rộng.**
### c. Ví dụ:
- Mỗi lớp con của lớp Animal đều triển khai phương thức animalSound khác nhau.
```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
```
```