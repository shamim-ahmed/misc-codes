#!/bin/bash

if [ "$#" != "2" ]; then
  echo "Usage : $0 <link> <extension>"
  exit 1
fi

# the standard command is : lynx --dump http://jcip.net/listings.html | awk '/http/{print $2}'

for file in `lynx --dump $1 | awk '/http/{print $2}' | grep $2`
do
  file_name=`basename $file`

  if [ -f $file_name ]; then
    echo "the file $file_name already exists and won't be downloaded again"
  else
    wget $file
  fi
done

