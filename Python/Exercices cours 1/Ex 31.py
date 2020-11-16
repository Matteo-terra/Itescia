def main():
    
    import random
    def extract(l):
        pair = []
        impair = []
        for x in l:
            if(x%2 == 0):
                pair.append(x)
            else:
                impair.append(x)
        print("La liste des entiers pair est : ",pair)
        print("La liste des entiers impair est : ",impair)

    l =[23,4,56,7,8,9,0,18,7,6,55,43,2]
    random.shuffle(l)
    print(extract(l))

if __name__ == '__main__':
    main()
