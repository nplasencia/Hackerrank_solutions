"""
· Task

You are given a string S.
Your task is to find out if the string S contains: alphanumeric characters, alphabetical characters, digits, lowercase and uppercase characters.

· Input Format

A single line containing a string S.

· Output Format

In the first line, print True if S has any alphanumeric characters. Otherwise, print False.
In the second line, print True if S has any alphabetical characters. Otherwise, print False.
In the third line, print True if S has any digits. Otherwise, print False.
In the fourth line, print True if S has any lowercase characters. Otherwise, print False.
In the fifth line, print True if S has any uppercase characters. Otherwise, print False.
"""


if __name__ == '__main__':
    s = input()

    alphanumerical = False
    alphabetical = False
    digits = False
    lowercase = False
    uppercase = False

    for char in s:
        if char.isalnum():
            alphanumerical = True
            if char.isdigit():
                digits = True

        if char.isalpha():
            alphabetical = True
            if char.islower():
                lowercase = True
            else:
                uppercase = True

        if alphanumerical and alphabetical and digits and lowercase and uppercase:
            break

    print("{0}\n{1}\n{2}\n{3}\n{4}".format(alphanumerical, alphabetical, digits, lowercase, uppercase))
