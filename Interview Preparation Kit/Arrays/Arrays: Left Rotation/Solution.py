

def rot_left(a, d):
    sub_arr_1 = a[:d]
    sub_arr_2 = a[d:]

    return sub_arr_2 + sub_arr_1


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    nd = input().split()
    n = int(nd[0])
    d = int(nd[1])
    a = list(map(int, input().rstrip().split()))
    result = rotLeft(a, d)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')
    fptr.close()
