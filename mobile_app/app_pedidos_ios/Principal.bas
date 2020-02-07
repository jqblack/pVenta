B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'Code module

Sub Process_Globals
	Private page As Page

	Private lblCantidadProductos As Label
	Private btnMasVendido As Button
	Private btnBuscarProducto As Button
	Private PanelTitulo As Panel
	Private PanelFooterv2 As Panel
	Private btnIniciarSecion As Button
	
	'SLIDE MENU
	Private Drawer As B4XDrawer
	Private ListSlide As CustomListView
	Private btnPrincipalBack As Button
End Sub

Sub Initialize
	
	page.Initialize("PagePrincipal")
	
	page.RootPanel.LoadLayout("frmPrincipal")
	
	

	Drawer.Initialize(Me, "drawer", page.RootPanel, 80%x)
	
	Drawer.CenterPanel.LoadLayout("frmPrincipal")
	Drawer.LeftPanel.LoadLayout("frmLeft")
	
	Main.NavControl.ShowPage2(page,True)
	
	
	
	
   lblCantidadProductos.Visible = False
   
   'SOMBRAS
	PanelTitulo.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
   
	btnMasVendido.SetShadow(Colors.Gray,0dip,2dip,0.2,True)
	btnBuscarProducto.SetShadow(Colors.Gray,0dip,2dip,0.2,True)
	
	PanelFooterv2.SetShadow(Colors.Gray,0dip,-2dip,0.3,True)
	
	btnIniciarSecion.SetShadow(Colors.Gray,1dip,2dip,0.2,True)
	
	For i = 1 To 30
		ListSlide.AddTextItem($"Item #${i}"$, "")
	Next
	
End Sub


Private Sub Page1_Resize(Width As Int, Height As Int)
	Drawer.Resize(Width, Height)
End Sub

Sub btnPrincipalBack_Click
	
	
	Drawer.LeftOpen = Not(Drawer.LeftOpen)
	
End Sub








