"""
You are given a string and your task is to swap cases. In other words, convert all lowercase letters to uppercase
letters and vice versa.
"""


def swap_case(input_string):

    # This solution es not too efficient cause string in Python are immutable so, every time that we make aux+= we are
    # creating a new variable.
    # aux = ""
    # for char in input_string:
    #     if char.islower():
    #         aux += char.upper()
    #     else:
    #         aux += char.lower()
    #
    # return aux

    return "".join([i.upper() if i.islower() else i.lower() for i in input_string])


if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
