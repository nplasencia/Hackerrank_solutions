"""
# a = "this is a string"
# a = a.split(" ") # a is converted to a list of strings.
# print a
# ['this', 'is', 'a', 'string']

# a = "-".join(a)
# print a
# this-is-a-string
"""


def split_and_join(line_in):
    # return line_in.replace(" ", "-") # For this exercise is valid
    return "-".join(line_in.split(" "))


if __name__ == '__main__':
    line = input()
    # print(*line.split(), sep="-") # You can do it directly on the print sentence
    result = split_and_join(line)
    print(result)
