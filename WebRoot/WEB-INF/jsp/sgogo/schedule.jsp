<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<h1>请上传学习记录文件</h1>
<form target="batchupdatelearnrecordformframe" id="batchupdatelearnrecordform" method="post" enctype="multipart/form-data" action="">
	<div>
		<!-- SevenLE -->
		<table style="margin:0 auto"><!-- 居中样式 -->
			<tr>
				<td>
					<input type="file" name="file" class="btn" style="width:300px;"/>
				</td>
				<td>
					<input type="button" id="batchupdatelearnrecordsubmitbtn" class="labelfield btn-default" value="提交" style="height:40px"/>
				</td>
			</tr>
		</table>
	</div>
</form>
<iframe id="batchupdatelearnrecordformframe" name="batchupdatelearnrecordformframe" style="display:none;">
</iframe>
<div id="batchupdatelearnrecordsdlg" style="display:none">请确认要上传该学习记录吗？</div>

<div id="learnrecordtablediv" style="width: 100%;height: 100%;">
	<div>
		<table id="learnrecordtable"></table>
		<div id='learnrecordpager'></div>
	</div>
</div>