#!/bin/bash

NAME="welcome2paradise"

git fetch --all
git reset --hard $NAME/master
git pull $NAME master
