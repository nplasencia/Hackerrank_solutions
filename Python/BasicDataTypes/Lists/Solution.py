

if __name__ == '__main__':
    N = int(input())
    res = []
    for _ in range(N):
        cmd, *args = input().split()

        if cmd != "print":
            eval("res.{0}({1})".format(cmd, ','.join(args)))
        else:
            print(res)
