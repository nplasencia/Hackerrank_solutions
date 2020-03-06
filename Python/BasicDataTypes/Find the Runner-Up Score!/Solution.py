"""
Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score.
You are given n scores. Store them in a list and find the score of the runner-up.
"""


def runner_up(values):

    return sorted(set(values))[-2]  # To get the unique elements of a list, turn it into a set


if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

    print(runner_up(arr))
