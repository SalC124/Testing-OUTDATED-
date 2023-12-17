import pandas

filePerms = pandas.read_csv('file_permits.csv')

print(filePerms.head())
print(filePerms.shape)
print(filePerms.loc[0])
events = filePerms['EventType']
for x in events:
    print(x)