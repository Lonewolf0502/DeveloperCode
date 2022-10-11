n=int(input("please enter any number"))
og=n/2
ncg=(og+(n/og))/2
while(og-ncg>0.00000000001):
    og=ncg
    ncg=(og+(n/og))/2
print(og)
    
