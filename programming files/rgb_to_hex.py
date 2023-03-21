# takes in red, green, and blue values and returns a hex string
def rgb_to_hex(r, g, b):
    
    # get rgb values in hex form
    r = max(0, min(255, r))
    g = max(0, min(255, g))
    b = max(0, min(255, b))
    
    # return hex string
    return '{:02X}{:02X}{:02X}'.format(r, g, b)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
