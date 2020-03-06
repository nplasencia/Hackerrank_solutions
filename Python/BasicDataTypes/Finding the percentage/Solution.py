

def average(arr):
    sum = 0
    for element in arr:
        sum +=element

    return sum / len(arr)


if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()

    values = student_marks.get(query_name);
    print("%.2f" % average(values))
