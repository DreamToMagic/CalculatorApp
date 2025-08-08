def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y == 0:
        raise ValueError("Cannot divide by zero.")
    return x / y

def main():
    print("简单计算器")
    print("请选择运算：")
    print("1. 加法")
    print("2. 减法")
    print("3. 乘法")
    print("4. 除法")

    choice = input("输入选择(1/2/3/4): ")

    num1 = float(input("输入第一个数字: "))
    num2 = float(input("输入第二个数字: "))

    if choice == '1':
        print("结果:", add(num1, num2))
    elif choice == '2':
        print("结果:", subtract(num1, num2))
    elif choice == '3':
        print("结果:", multiply(num1, num2))
    elif choice == '4':
        try:
            print("结果:", divide(num1, num2))
        except ValueError as e:
            print(e)
    else:
        print("无效选择")

if __name__ == "__main__":
    main()