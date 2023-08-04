package Algorithms.lesson2.Interface;

import Algorithms.lesson2.Exceptions.CustomExceptDemo;

public interface ICharQ {
    void put(char ch) throws CustomExceptDemo.QueueFullException;
    char get() throws CustomExceptDemo.QueueEmptyException;
}
