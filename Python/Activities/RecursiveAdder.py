def sum(num):
    if num<=0:
        return num
    else:
        return num + sum(num-1)
num = int(input("Enter a Number: "))
print("The sume is: ", sum(num))
