

def hourglass_sum(arr):
    # Sum
    res = -9*7
    for row in range(0, len(arr) - 2):
        for column in range(0, len(arr) - 2):
            sum = int(arr[row][column]) + int(arr[row][column + 1]) + int(arr[row][column + 2]) \
                  + int(arr[row + 1][column + 1]) \
                  + int(arr[row + 2][column]) + int(arr[row + 2][column + 1]) + int(arr[row + 2][column + 2])
            if sum > res:
                res = sum

    return res


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    arr = []
    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = hourglassSum(arr)
    fptr.write(str(result) + '\n')
    fptr.close()
