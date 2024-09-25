with open('input.txt') as f:
    tmp = f.readlines()
    input_arr = tmp[0].split(" ")

print("Кол-во слов (в тексте есть перенос строки - он посчитан) = " + str(len(input_arr)))

big_word = input_arr[0]


for i in input_arr:
    if len(big_word) < len(i):
        big_word = i

print("Одно из самых длинных слов (слово длиннее которого нет) = " + big_word)

result = {}
for word in input_arr:
    result[word] = result.get(word, 0) + 1

print("Кол-во вхождений каждого слова: ")
print(result)
