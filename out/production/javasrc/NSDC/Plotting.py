from matplotlib import pyplot as plt
data1 = [1,2,3,4,5]
data2 = [2,4,6,8,10]
whichGraph = input('Which graph would you like?\n')
if (whichGraph == 'plot'):
    plt.plot(data1,data2,color = 'r')
if (whichGraph == 'bar'):
    plt.bar(data1,data2)
if (whichGraph == 'pie'):
    plt.pie(data1,data2)
if (whichGraph == 'scatter'):
    plt.scatter(data1,data2)
plt.show()