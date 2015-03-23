#!/bin/sh

# simple iteration
for i in {1..47}; do echo $i; done

# download files with names that follow a particular pattern
for i in {1..47}; do  wget http://media.raagalahari.com/gallery/shabnakhan/shabnakhan${i}.jpg; done

# advanced formatting in shell
for i in {1..138}
do
  x=`printf "%04d" $i`
  wget http://www.idlebrain.com/movie/photogallery/shabnakhan/images/shabnakhan-$x.jpg
done




