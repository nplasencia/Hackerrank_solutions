"""
Create this with the input rows and columns separated by one space

-------------.|.--------------
----------.|..|..|.-----------
-------.|..|..|..|..|.--------
----.|..|..|..|..|..|..|.-----
-.|..|..|..|..|..|..|..|..|.--
-----------WELCOME------------
-.|..|..|..|..|..|..|..|..|.--
----.|..|..|..|..|..|..|.-----
-------.|..|..|..|..|.--------
----------.|..|..|.-----------
-------------.|.--------------
"""

rows, columns = map(int, input().split())

pattern = [(i*".|.").center(columns, "-") for i in range(1, rows, 2)]
print("\n".join(pattern + ["WELCOME".center(columns, "-")] + pattern[::-1]))
