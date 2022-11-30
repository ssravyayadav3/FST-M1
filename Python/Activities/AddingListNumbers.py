def sum(nums):
	sum = 0
	for num in nums:
		sum += num
	return sum

list = [2, 4, 6, 8]
result = sum(list)
print("The sum of all the elements is: " + str(result))