str = ("dream", "dreamer", "erase", "eraser")
word = iter(str)
a = input()

for i in range(4):
    if str[i] < a:
        ans = str[i]

while ans < a:
    for i in range(4):
        temp = ans
        temp += str[i]
        if temp == a:
            print("YES")
            break
        elif temp < a:
            ans = temp
            break
print("NO")      

        

        

# while True:
#     for i in range(4):
#         temp = iter(next(i))
#         if temp < str :
#             print("YES")
#               break