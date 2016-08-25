

cmake_minimum_required (VERSION 2.8)
project ( communication.out )

 
#
# OpenCV Packaage
find_package( OpenCV REQUIRED )

 
# add the binary tree to the search path for include files
# so that we will find TutorialConfig.h
include_directories("${PROJECT_BINARY_DIR}")


# add the executable
# and link OpenCV Lib.
add_executable(communication.out main.cpp Communication.cpp Communication.h)
target_link_libraries( communication.out ${OpenCV_LIBS})


