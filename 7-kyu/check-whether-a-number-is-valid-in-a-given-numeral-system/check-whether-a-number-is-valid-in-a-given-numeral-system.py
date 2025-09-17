def validate_base(num: str, base: int) -> bool:
    bases = ['0','1','2','3','4','5','6','7','8','9',
                      'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q'
                        ,'R','S','T','U','V','W','X','Y','Z']
    for i in range(len(num)):
        for j in range(len(bases) - base):
            if(num[i] == bases[j+base]): return False;
    return True
​