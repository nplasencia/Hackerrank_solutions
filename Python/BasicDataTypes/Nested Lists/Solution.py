"""
Given the names and grades for each student in a Physics class of N students, store them in a nested list and print the
name(s) of any student(s) having the second lowest grade.

Note: If there are multiple students with the same grade, order their names alphabetically and print each name on a new
line.

· Input Format

The first line contains an integer, N, the number of students.
The  subsequent lines describe each student over  lines; the first line contains a student's name, and the second line contains their grade.
"""


if __name__ == '__main__':
    res = {}

    for _ in range(int(input())):
        name = input()
        score = float(input())

        try:
            res[score].append(name)
        except KeyError:
            res[score] = [name]

    index = sorted(res.keys())[1]
    for item in sorted(res.get(index)):
        print(item)
