package com.example.mod6demo3.repository

import com.example.mod6demo3.bo.Tree
import com.example.mod6demo3.dao.TreeDAO

class TreeRepository(private val treeDAO: TreeDAO) {

    fun getTree(id : Long): Tree {
        return treeDAO.findById(id)
    }

    fun getAllTrees(): List<Tree> {
        return treeDAO.findAll()
    }

    fun addTree(tree: Tree) : Long{
        return treeDAO.insert(tree)
    }


}