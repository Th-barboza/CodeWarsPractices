def invite_more_women(arr):
    soma = 0
    for i in range(len(arr)):
        soma += arr[i]
    if(soma > 0): return True
    else: return False