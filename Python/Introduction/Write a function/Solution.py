

def is_leap(year):

    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                return True

        else:
            return True

    return False


while True:
    year_input = int(input())
    print(is_leap(year_input))
