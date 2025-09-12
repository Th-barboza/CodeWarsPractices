def is_uppercase(inp):
    low = "abcdefghijklmnoprstuvwxyz"
    for caractere in inp:
        if(caractere in low): return False
    return True