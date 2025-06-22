
sdk list java | grep installed

# list java installtions available for fx-zulu
sdk list java | grep fx-zulu
echo y | sdk install java 21.0.7.fx-zulu

sdk list java | grep tem
echo y | sdk install java 21.0.7-tem

sdk default java 21.0.7.fx-zulu
sdk current
dirname $(dirname $(readlink -f $(which java)))


sdk default java 17.0.15.fx-zulu
sdk current
dirname $(dirname $(readlink -f $(which java)))

sdk default java 11.0.27.fx-zulu
sdk current
dirname $(dirname $(readlink -f $(which java)))




