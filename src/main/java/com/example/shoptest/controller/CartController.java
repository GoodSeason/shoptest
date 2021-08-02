package com.example.shoptest.controller;


import com.example.shoptest.common.Result;
import com.example.shoptest.entity.vo.CartVO;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 *  购物车Controller
 */
@RestController
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping("/list")
    @ApiOperation("购物车列表")
    public Response list() {
        //内部获取用户ID，防止横向越权
        List<CartVO> cartList = cartService.list(UserFilter.currentUser.getId());
        return Response.success(cartList);
    }

    @PostMapping("/add")
    @ApiOperation("添加商品到购物车")
    public Response add(@RequestParam Integer productId, @RequestParam Integer count) {
        List<CartVO> cartVOList = cartService.add(UserFilter.currentUser.getId(), productId, count);
        return Response.success(cartVOList);
    }

    @PostMapping("/update")
    @ApiOperation("更新购物车")
    public Response update(@RequestParam Integer productId, @RequestParam Integer count) {
        List<CartVO> cartVOList = cartService
                .update(UserFilter.currentUser.getId(), productId, count);
        return Response.success(cartVOList);
    }

    @PostMapping("/delete")
    @ApiOperation("删除购物车")
    public Response delete(@RequestParam Integer productId) {
        //不能传入userID，cartID，否则可以删除别人的购物车
        List<CartVO> cartVOList = cartService.delete(UserFilter.currentUser.getId(), productId);
        return Response.success(cartVOList);
    }

    @PostMapping("/select")
    @ApiOperation("选择/不选择购物车的某商品")
    public Response select(@RequestParam Integer productId, @RequestParam Integer selected) {
        //不能传入userID，cartID，否则可以删除别人的购物车
        List<CartVO> cartVOList = cartService
                .selectOrNot(UserFilter.currentUser.getId(), productId, selected);
        return Response.success(cartVOList);
    }

}
