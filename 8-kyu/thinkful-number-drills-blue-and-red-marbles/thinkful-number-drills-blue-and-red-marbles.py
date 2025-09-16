def guess_blue(blue_start, red_start, blue_pulled, red_pulled):
    blues = blue_start - blue_pulled
    reds = red_start - red_pulled
    total = reds + blues;
    
    return blues / total