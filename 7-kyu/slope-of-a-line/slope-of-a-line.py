def get_slope(p1, p2):
    if p1[0] == p2[0]: return None
    return (p1[1] - p2[1]) / (p1[0] - p2[0])