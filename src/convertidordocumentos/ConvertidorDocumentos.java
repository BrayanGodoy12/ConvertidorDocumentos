/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package convertidordocumentos;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.Workbook;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.words.Document;
/**
 *
 * @author Brayan Godoy
 */
public class ConvertidorDocumentos {
    public void DocxToOdt(String patch) throws Exception {
        String aux;
        Document doc = new Document(patch);
        aux = this.deleteExt(patch);
        doc.save(aux + ".odt");
    }

    public void OdtToDocx(String patch) throws Exception {
        String aux;
        Document doc = new Document(patch);
        aux = this.deleteExt(patch);
        doc.save(aux + ".docx");
    }
    public void OdtToDoc(String patch) throws Exception {
        String aux;
        Document doc = new Document(patch);
        aux = this.deleteExt(patch);
        doc.save(aux + ".doc");
    }

    public void XlsxToOds(String patch) throws Exception {
        String aux;
        Workbook book = new Workbook(patch);
        aux = this.deleteExt(patch);
        book.save(aux + ".ods", FileFormatType.ODS);
    }

    public void OdsToXlsx(String patch) throws Exception {
        String aux;
        Workbook book = new Workbook(patch);
        aux = this.deleteExt(patch);
        book.save(aux + ".xlsx", FileFormatType.XLSX);
    }
    public void OdsToXls(String patch) throws Exception {
        String aux;
        Workbook book = new Workbook(patch);
        aux = this.deleteExt(patch);
        book.save(aux + ".xls");
    }

    public void PptxToOdp(String patch) throws Exception {
        try {
        String aux;
        System.out.println(patch);
        Presentation pres = new Presentation(patch);
        aux = this.deleteExt(patch);
        pres.save(aux + ".odp", SaveFormat.Odp); 
        } catch (Exception e) {
        }
        
    }

    public void OdpToPptx(String patch) throws Exception {
        try {
            String aux;
        Presentation pres = new Presentation(patch);
        aux = this.deleteExt(patch);
        pres.save(aux + ".pptx", SaveFormat.Pptx);
        } catch (Exception e) {
        }
        
    }
    public void OdpToPpt(String dir) throws Exception {
        try {
        String modificado;
        Presentation pres = new Presentation(dir);
        modificado = this.deleteExt(dir);
        pres.save(modificado + ".ppt", SaveFormat.Ppt);
        } catch (Exception e) {
        }
        
    }
    private String deleteExt(String dir) {
        String[] aux= new String[1];
        aux=dir.split("\\.");
        System.out.println(""+aux[0]);
        return aux[0];
       
    }

 
   
    
}
