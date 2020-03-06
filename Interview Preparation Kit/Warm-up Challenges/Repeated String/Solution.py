

def repeated_string(s, n):

    if set(s) == {"a"}:
        return n

    res = n//len(s) * s.count("a")
    falta = n % len(s)
    res += (s[:falta].count("a"))
    return res


print(repeated_string("aaab", 10))
