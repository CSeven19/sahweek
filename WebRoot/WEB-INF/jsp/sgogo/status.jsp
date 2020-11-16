<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style type="text/css">
	/* h1 { text-align: center;  }
	h2 { font-family: "微软雅黑"; line-height:100px;} */

	.box{ width: 200px; height: 200px; padding: 100px; display: inline-block; border: 1px solid white; text-align: center;
		perspective: 400px;
	}
	
	.box:hover #div{ transform: rotateY(-360deg);}
		
	.div div{ width: 200px; height: 200px; position: absolute; top: 0px; left: 0px; opacity: 0.6;
		border-radius: 50px; border: 1px solid white;
		transform-origin: center center -100px;
	}

	.div1{ font: 50px/200px "微软雅黑"; color: white; position: relative; 
		transform-style:preserve-3d;
		animation: mupiao 3s infinite linear running;
		transform-origin: center 100px -100px;
	}
	
	.div2{ font: 50px/200px "微软雅黑"; color: white; position: relative; 
		transform-style:preserve-3d;
		animation: mupiao2 3s infinite linear running;
		transform-origin: center 100px -100px;
	}
	/* 定义了动画mupiao3 6s */
/* 	.div3{ font: 50px/200px "微软雅黑"; color: white; position: relative; 
		transform-style:preserve-3d;
		transition: 6s all; 
		animation: mupiao3 6s infinite linear running;
		transform-origin: center 100px -100px;
	} */
	/* 定义了动画mupiao3 6s */
	#crapsDiv{ font: 50px/200px "微软雅黑"; color: white; position: relative; 
		transform-style:preserve-3d;
		transition: 6s all; 
		animation: mupiao3 6s infinite linear running;
		transform-origin: center 100px -100px;
	}
	
	.div div:nth-of-type(1){
		background: red;
		transform: rotateY(0deg);
	}
	.div div:nth-of-type(2){
		background: green;
		transform: rotateY(90deg);
	}
	.div div:nth-of-type(3){
		background: blue;
		transform: rotateX(180deg);
	}
	.div div:nth-of-type(4){
		background: purple;
		transform: rotateY(270deg);
	}
	.div div:nth-of-type(5){
		background: yellow;
		transform: rotateX(90deg);
	}
	.div div:nth-of-type(6){
		background: cyan;
		transform: rotateX(270deg);
	}
	
	
	
/* 	.div4{ font: 50px/200px "微软雅黑"; color: white; position: relative; 
		transform-style:preserve-3d;
		animation: mupiao4 6s infinite linear running;
		transform-origin: center 100px -100px;
	}
	.div4 div{transition: 1s all; opacity: 1; border-radius: 0px;}
	
	.div4 div:nth-of-type(1){
		background: red;
		transform: rotateY(0deg);
	}
	.div4 div:nth-of-type(2){
		background: green;
		transform: rotateY(0deg);
	}
	.div4 div:nth-of-type(3){
		background: blue;
		transform: rotateY(0deg);
	}
	.div4 div:nth-of-type(4){
		background: purple;
		transform: rotateY(0deg);
	}
	.div4 div:nth-of-type(5){
		background: yellow;
		transform: rotateX(0deg);
	}
	.div4 div:nth-of-type(6){
		background: cyan;
		transform: rotateX(0deg);
	}
	
	.div4:hover div:nth-of-type(1){
		opacity: 0.6;
		border-radius: 100px;
		transform: rotateY(0deg);
	}
	.div4:hover div:nth-of-type(2){
		opacity: 0.6;
		border-radius: 100px;
		transform: rotateY(90deg);
	}
	.div4:hover div:nth-of-type(3){
		opacity: 0.6;
		border-radius: 100px;
		transform: rotateY(180deg);
	}
	.div4:hover div:nth-of-type(4){
		opacity: 0.6;
		border-radius: 100px;
		transform: rotateY(270deg);
	}
	.div4:hover div:nth-of-type(5){
		opacity: 0.6;
		border-radius: 100px;
		transform: rotateX(90deg);
	}
	.div4:hover div:nth-of-type(6){
		opacity: 0.6;
		border-radius: 100px;
		transform: rotateX(270deg);
	} */
	
	
	
/* 	@keyframes mupiao{
		0%{
			transform: rotateY(0deg);
		}
		100%{
			transform: rotateY(-360deg);
		}
		
	}
	
	@keyframes mupiao2{
		0%{
			transform: rotateX(0deg);
		}
		100%{
			transform: rotateX(360deg);
		}
	} */
	
	/* @keyframes关键帧，mupiao3帧名，{}动画控制 */
	@keyframes mupiao3{
		1%{
			transform: rotateY(0deg);
		}
		50%{
			transform: rotateY(-680deg);
		}
		51%{
			transform: rotateX(0deg);
		}
		100%{
			transform: rotateX(-680deg);
		}
	}
	
	/* @keyframes mupiao4{
		0%{
			div:nth-of-type(1){
				transform: rotateY(0deg);
			}
			div:nth-of-type(2){
				transform: rotateY(0deg);
			}
			div:nth-of-type(3){
				transform: rotateY(0deg);
			}
			div:nth-of-type(4){
				transform: rotateY(0deg);
			}
			div:nth-of-type(5){
				transform: rotateX(0deg);
			}
			div:nth-of-type(6){
				transform: rotateX(0deg);
			}
		}
		100%{
			div:nth-of-type(1){
				transform: rotateY(0deg);
			}
			div:nth-of-type(2){
				transform: rotateY(90deg);
			}
			div:nth-of-type(3){
				transform: rotateY(180deg);
			}
			div:nth-of-type(4){
				transform: rotateY(270deg);
			}
			div:nth-of-type(5){
				transform: rotateX(90deg);
			}
			div:nth-of-type(6){
				transform: rotateX(270deg);
			}
		}
	} */
	
</style>
<!-- <div class="box">
	<div class="div div1">
		<div>1</div>
		<div>2</div>
		<div>3</div>
		<div>4</div>
		<div>5</div>
		<div>6</div>
	</div>
	<h2>横向滚动</h2>
</div> -->

<!-- <div class="box">
	<div class="div div2">
		<div>1</div>
		<div>5</div>
		<div>3</div>
		<div>6</div>
		<div>4</div>
		<div>2</div>
	</div>
	<h2>纵向滚动</h2>
</div> -->

<div class="box">
	<div id="crapsDiv" class="div div3">
		<div id="crapsDivChild1">1</div>
		<div id="crapsDivChild2">2</div>
		<div id="crapsDivChild3">3</div>
		<div id="crapsDivChild4">4</div>
		<div id="crapsDivChild5">5</div>
		<div id="crapsDivChild6">6</div>
	</div>
	<!-- <h2>纵横滚动</h2> -->
</div>
<div id="weekstatusrankDiv" style="text-align:left">
	<img src="/sgogo/Image/sgogo/a.png"/>
</div>
<!-- 
<div class="box">
	<div class="div div4">
		<div>1</div>
		<div>2</div>
		<div>3</div>
		<div>4</div>
		<div>5</div>
		<div>6</div>
	</div>
	<h2>鼠标指我</h2>
</div> -->